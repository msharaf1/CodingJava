package com.ninjagold.ninja.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
    int earnedGold;
    
    @GetMapping("/")
    public String mainPage(HttpSession session){
        session.getAttribute("gold");
        session.setMaxInactiveInterval(2000);
        return "index";
    }
    @PostMapping("/")
    public String addFarm(HttpSession session, @RequestParam(value = "gold", required = false) String gold){
        if(gold.equals("farm")){
            if(session.getAttribute("earnedGold") ==null){
                session.setAttribute("earnedGold", 20);
                System.out.println(session.getCreationTime());
            }
            else{
                session.setAttribute("earnedGold", (Integer) session.getAttribute("earnedGold") + 20);
            }
        }
        if(gold.equals("cave")){
                if(session.getAttribute("earnedGold") ==null){
                    session.setAttribute("earnedGold", 30);
                }
                else{
                    session.setAttribute("earnedGold", (Integer) session.getAttribute("earnedGold") + 30);
                        }
                    
                }
        return "redirect:/";
    }



    @GetMapping("/reset")
    public String reset(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}