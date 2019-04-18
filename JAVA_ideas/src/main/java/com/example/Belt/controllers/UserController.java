package com.example.Belt.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Belt.models.Idea;
import com.example.Belt.models.User;
import com.example.Belt.services.IdeaService;
import com.example.Belt.services.UserService;

@Controller
public class UserController {
	private final UserService uS;
	private final IdeaService iS;
    
    public UserController(UserService uS, IdeaService iS) {
        this.uS = uS;
        this.iS = iS;
    }
    
    @GetMapping("/")
    public String showRegister(Model model, @ModelAttribute("user") User user, HttpSession session) {
    	session.invalidate();
        return "register";
    }
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
    	if (result.hasErrors()) {
            return "register"; 
        } else {
            if (!user.getPassword().equals(user.getConfirm())) {
            	model.addAttribute("userError", "Passwords must match.");
            	return "register";
            } else {
	            User exists = uS.findByEmail(user.getEmail());
	            if(exists != null) {
	            	model.addAttribute("userError", "A user with this email already exists.");
	            	return "register";
	            } else {
	            	String pw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
	                user.setPassword(pw);
	            	User u = uS.create(user);
	            	session.setAttribute("id", u.getId());
	            	return "redirect:/ideas";
	            }
	        }
        }
    }
    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    	if (email.length() < 1) {
    		model.addAttribute("loginError", "Invalid Credentials");
    		model.addAttribute("user", new User());
            return "register"; 
    	}
    	if (password.length() < 8) {
    		model.addAttribute("loginError", "Invalid Credentials");
    		model.addAttribute("user", new User());
    		return "register";
    	}
    	User u = uS.findByEmail(email);
    	if (u == null) {
    		model.addAttribute("loginError", "Invalid Credentials");
    		model.addAttribute("user", new User());
    		return "register";
        } else {
        	Boolean matches = BCrypt.checkpw(password, u.getPassword());
        	if (matches) {
        		session.setAttribute("id", u.getId());
        		return "redirect:/ideas";
        	}else {
        		model.addAttribute("loginError", "Invalid Credentials");
        		model.addAttribute("user", new User());
        		return "register";
        	}
        }    
    }
    
    @GetMapping("/ideas")
    public String home(Model model, HttpSession session) {
    	Long id = (Long)session.getAttribute("id");
        User user = uS.findById(id);
        model.addAttribute("user", user);
        List<Idea> ideas = iS.findAll();
        model.addAttribute("ideas", ideas);
        return "dashboard";
    }

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
	    return "redirect:/";   
	}
}




