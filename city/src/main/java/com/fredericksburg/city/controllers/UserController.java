package com.fredericksburg.city.controllers;

import javax.validation.Valid;

import com.fredericksburg.city.models.User;
import com.fredericksburg.city.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/users")
public class UserController{
    private UserService userServ;

    public UserController(UserService userServ){
        this.userServ = userServ;
    }

    @GetMapping("")
    public String showUser(@ModelAttribute("user") User user){
        return "register";
    }
    @PostMapping("")
    public String RegisterUser(@Valid @ModelAttribute("user") User user, BindingResult bResult){
        if(bResult.hasErrors()){
            return "register";
        }else{
            userServ.createUser(user);
        }
        return "redirect:/users";
    }    



}//class bracket