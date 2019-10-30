package com.ninjagold.ninja.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
    int earnedGold;
    String res;
    Random random = new Random();
    
    // public int getRandomNumber(int min, int max){
    //     return random.nextInt((max-min)+1)+min;
        
    // }
    // public int getRandomNumberInts(int min, int max){
    //     return random.ints(min,(max+1)).findFirst().getAsInt();
    // }

    @GetMapping("/")
    public String mainPage(HttpSession session){
        if(session.getAttribute("earnedGold") == null){
            session.setAttribute("earnedGold", 0);
            session.setAttribute("res", "");
        }
        session.setMaxInactiveInterval(2000);
        return "index";
    }
    @PostMapping("/")
    public String addFarm(HttpSession session, @RequestParam(value = "gold", required = false) String gold){
        if(gold.equals("farm")){
            if(session.getAttribute("earnedGold") ==null){
                session.setAttribute("earnedGold", random.nextInt(10)+10);
                res  += " house and earned "+gold+" gold.";
                session.setAttribute("res", (String) session.getAttribute("res")+res+"\n");
                System.out.println(session.getCreationTime());
            }
            else{
                session.setAttribute("earnedGold", (Integer) session.getAttribute("earnedGold") + random.nextInt(10)+10);
            }
        }
        if(gold.equals("cave")){
                if(session.getAttribute("earnedGold") ==null){
                    session.setAttribute("earnedGold", random.nextInt(5)+5);
                }
                else{
                    session.setAttribute("earnedGold", (Integer) session.getAttribute("earnedGold") + random.nextInt(5)+5);
                        }
                    
                }
        
        if(gold.equals("house")){
            if(session.getAttribute("earnedGold") ==null){
                session.setAttribute("earnedGold", random.nextInt(3)+2);
            }
            else{
                session.setAttribute("earnedGold", (Integer) session.getAttribute("earnedGold") + random.nextInt(3)+2);
                    }
                
            }

        if(gold.equals("casino")){
            if(session.getAttribute("earnedGold") ==null){
                session.setAttribute("earnedGold", random.nextInt(100)-50);
            }
            else{
                session.setAttribute("earnedGold", (Integer) session.getAttribute("earnedGold") + random.nextInt(100)-50);
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