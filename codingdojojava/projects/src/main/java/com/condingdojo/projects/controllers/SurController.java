package com.condingdojo.projects.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
// @RequestMapping("/survey")
public class SurController {

    @GetMapping("/survey")
    public String showSurv(HttpSession session){
        return "surv";
    }

    @PostMapping("add")
    public String createSurv(HttpSession session, RedirectAttributes redirectAttributes, 
    @RequestParam("name") String name,@RequestParam("language") String language ,
    @RequestParam("location") String location, @RequestParam("comment") String comment){
        if(name.length() < 1) {
			redirectAttributes.addFlashAttribute("error", "Name is required.");
			return "redirect:/survey";
		}    
            session.setAttribute("sname", name);
            session.setAttribute("slang", language);
            session.setAttribute("sloc", location);
            session.setAttribute("somm", comment);
            
            System.out.println(session.getAttribute(name));
            // session.getAttribute(language);
            // session.getAttribute(location);
            // session.getAttribute(comment);
            // System.out.println(name +language+location+comment);
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String getMethodName( HttpSession session) {

        return "survresult";
    }
    
    
}