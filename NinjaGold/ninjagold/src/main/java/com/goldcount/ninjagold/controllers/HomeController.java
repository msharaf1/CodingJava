package com.goldcount.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class HomeController {
    

    @GetMapping("/farm")
    public String showFarm(@RequestParam(value="farm", required=false) String farm, 
      Model model, HttpSession session){
            session.getAttribute(farm);
        return "index.jsp";
        }

    @PostMapping("/farm")
    public String getFarmValue(@RequestParam(value="farm", required = false) String farm, Model model, HttpSession session) {
        //TODO: process POST request
        Random random = new Random();
        int n=0;
        // session.getAttribute(farm);

        if(farm.equals("farm")){
            n = random.nextInt(10) +10;
            System.out.println(n);
            session.setAttribute(farm, n);
        }
        return "redirect:/farm";
    }
    

    @GetMapping("/cave")
    public String showCave(
    @RequestParam(value="cave", required=false) String cave, Model model, HttpSession session){
            
        if(session.getAttribute(cave) != null) {
                
            };
        return "index.jsp";
        }
    @PostMapping("/cave")
    public String getCavegetValue(@RequestParam(value="cave", required = false) String cave,
    Model model, HttpSession session) {
        //TODO: process POST request
        Random random = new Random();
        int n=0;
  
        if(cave.equals("cave")){
            n = random.nextInt(60);
            System.out.println(n);
            session.setAttribute(cave, n);
        }

        return "redirect:/cave";
    }

    @GetMapping("/house")
    public String showHouse(@RequestParam(value="house", required=false) String house, Model model, HttpSession session){
            session.getAttribute(house);
        return "index.jsp";
        }

    @PostMapping("/house")
    public String getHouse(@RequestParam(value="house", required = false) String house,
    Model model, HttpSession session) {
        //TODO: process POST request
        Random random = new Random();
        int n=0;
  
        if(house.equals("house")){
            n = random.nextInt(60);
            System.out.println(n);
            session.setAttribute(house, n);
        }

        return "redirect:/house";
    }
    @GetMapping("/casino")
    public String showCasino(@RequestParam(value="casino", required=false) String house, Model model, HttpSession session){
            session.getAttribute(house);
            // session.getAttribute(casino);
        return "index.jsp";
        }

    @PostMapping("/casino")
    public String getCasino(@RequestParam(value="casino", required = false) String casino,
    Model model, HttpSession session) {
        //TODO: process POST request
        Random random = new Random();
        int n=0;
  
        if(casino.equals("casino")){
            n = random.nextInt(60);
            System.out.println(n);
            session.setAttribute(casino, n);
        }

        return "redirect:/casino";
    }

    // @PostMapping(value="/gold")
    // public String getHouseValue(
    // @RequestParam(value="house", required = false) String house,
    // Model model, HttpSession session) {
    //     //TODO: process POST request
    //     Random random = new Random();
    //     int n=0;
    //     // session.getAttribute(farm);
    //     if(house.equals("house")){
    //         n = random.nextInt(70);
    //         System.out.println(n);
    //     }

        
    //     return "redirect:/gold";
    // }
    // @PostMapping(value="/gold")
    // public String postMethodName(
    // @RequestParam(value="casino", required = false) String casino, 
    // Model model, HttpSession session) {
    //     //TODO: process POST request
    //     Random random = new Random();
    //     int n=0;
    //     // session.getAttribute(farm);
  
 
    //     if(casino.equals("casino")){
    //         n = random.nextInt(50)*(20) -20;
    //         System.out.println(n);
    //     }

        
    //     return "redirect:/gold";
    // }



}//class Home