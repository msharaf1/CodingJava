package com.amadon.msSales.controllers;

import com.amadon.msSales.models.User;
import com.amadon.msSales.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")

public class UserController {
    private UserService userServ;

    public UserController(UserService userServ){
        this.userServ = userServ;
        System.out.println("This is from User Service");

    }

    @GetMapping("")
    public String showRegister(@ModelAttribute("user") User user){
        System.out.println("This is from User Service Part2");
        return "register";
    }

    @PostMapping("")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult bResult){
        if(bResult.hasErrors()){
            return "register";
        }else{
            userServ.create(user);
        }

        return "redirect:/users";

    }

}//UserController bracket
