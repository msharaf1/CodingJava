package com.example.Belt.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Belt.models.Idea;
import com.example.Belt.models.User;
import com.example.Belt.services.IdeaService;
import com.example.Belt.services.UserService;


@Controller
@RequestMapping("/ideas")
public class IdeaController {
	private final UserService uS;
	private final IdeaService iS;
	
    public IdeaController(IdeaService iS, UserService uS) {
    	this.iS = iS;
        this.uS = uS;
    }
    
    @RequestMapping("/{id}")
    public String detials(@PathVariable("id") Long id, Model model) {
    	Idea idea = iS.findById(id);
    	List<User> likers = iS.listLikers(idea);
    	System.out.println(id);
    	System.out.println(likers);
    	model.addAttribute("idea", idea);
    	model.addAttribute("likers", likers);
    	return "display";
    }
    @PostMapping("/new")
    public String createIdea(@ModelAttribute("idea") Idea idea, BindingResult result, HttpSession session, Model model){
		if (idea.getContent().length() < 1) {
    		model.addAttribute("errors", "Must include content");
    		model.addAttribute("idea", new Idea());
    		System.out.println("1");
            return "create"; 
    	} else {
    		Long user_id = (Long)session.getAttribute("id"); 
        	User creator =  uS.findById(user_id);
    		idea.setCreator(creator);
    		iS.create(idea);
    		return "redirect:/ideas";
    	}
    }
    @RequestMapping("/new")
    public String newForm(@ModelAttribute("idea") Idea idea){
    	return("create");
    }
    
    @RequestMapping("/{id}/like")
    public String like(@PathVariable("id") Long id, HttpSession session) {
    	Idea idea = iS.findById(id);
    	Long user_id = (Long)session.getAttribute("id");
    	User user = uS.findById(user_id);
    	iS.likeIdea(idea, user);
    	return "redirect:/ideas";
    }
    @RequestMapping("/{id}/unLike")
    public String unLike(@PathVariable("id") Long id, HttpSession session) {
    	Idea idea = iS.findById(id);
    	Long user_id = (Long)session.getAttribute("id");
    	User user = uS.findById(user_id);
    	iS.unLinkIdea(idea, user);
    	return "redirect:/ideas";
    }
    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id, HttpSession session) {
    	Long user_id = (Long)session.getAttribute("id");
    	if (user_id != null) {
    		Idea idea = iS.findById(id);
    		User user = uS.findById(user_id);
    		if (idea.getCreator().getId() == user.getId()) {
    			iS.delete(id);
    			return "redirect:/ideas";  
    		}
			return "redirect:/ideas";
    	}
		return "redirect:/";
    }
    @RequestMapping("/{id}/edit")
    public String editPage(@PathVariable("id") Long id, Model model, HttpSession session) {
    	Long user_id = (Long) session.getAttribute("id");
		if (user_id != null) {			
			Idea i = iS.findById(id);
			User u = uS.findById(user_id);
			if (i.getCreator().getId() == u.getId()) {
				model.addAttribute("idea", i);
				return "edit";
			}
			return "redirect:/ideas";
		}
		return "redirect:/";
    }
    @PostMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, @ModelAttribute("idea") Idea idea, HttpSession session, Model model) {
    	System.out.println("0");
    	Long user_id = (Long)session.getAttribute("id");
    	if (user_id != null) {	
    		Idea i = iS.findById(id);
			User u = uS.findById(user_id);
			if (i.getCreator().getId() == u.getId()) {
				if (idea.getContent().length() < 1) {
					model.addAttribute("loginError", "Content cannot be blank");
					return "redirect:/{id}/edit";
				}
				i.setContent(idea.getContent());
				iS.update(i);
				return "redirect:/ideas";
			}
			System.out.println(idea.getCreator().getId());
			return "redirect:/ideas";
		}
    	System.out.println("4");  
		return "redirect:/";
    }

}


