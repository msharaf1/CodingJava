package com.condingdojo.projects.controllers;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/home")
public class WebController {

    @GetMapping("")
    public String showHome( HttpSession session){
        // session.setAttribute("count", 0);
        System.out.println(session.getId().concat("   id"));
        
        if(session.getAttribute("count") == null){
            session.setAttribute("count", 0);
        }else{
            session.setAttribute("count", (Integer) session.getAttribute("count")+1);
            
        }


        return "index";
    }
    @GetMapping("/reset")
    public String resetSess(HttpSession session){
        session.invalidate();
        return "redirect:/home";
    }
    @GetMapping("/createerror")
    public String flashmessage(RedirectAttributes redAttribute){
        redAttribute.addFlashAttribute("error", "A test error ");
        return "redirect:/home";
    }

    
}