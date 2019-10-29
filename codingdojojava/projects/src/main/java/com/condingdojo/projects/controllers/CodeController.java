package com.condingdojo.projects.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/code")
public class CodeController {

    @GetMapping("")
    public String submitPage(){
        // model.addAttribute("secCode", secCode);
        return "codepage";
    }
    @GetMapping("/codes")
    public String showCodes(Model model){
        String[] words = {"Loyalty", "Courage", "Veracity", "Composasion", "Honor"};
        model.addAttribute("words", words);
        return "trycodes";
    }
    @PostMapping("/word")
    public String submitedCode(@RequestParam(value="passCode") String passCode, RedirectAttributes redAtt){
        String secCode = "bushido";
        if(passCode.equals(secCode)){
            return "redirect:/code/codes";
        }else {
         redAtt.addFlashAttribute("error", "Try hard again");
         return "redirect:/code";   
        }
    }
    // @GetMapping("/code")
}












//     @PostMapping("/word")
//     public String submitedCode(@RequestParam(value="secCode") String secCode, HttpSession session, HttpServletRequest requServlet){
//         String[] words = {"Loyalty", "Courage", "Veracity", "Composasion", "Honor"};
//         requServlet.setAttribute("secCode", secCode);
//         requServlet.getSession().getAttribute("secCode");
//         System.out.println(requServlet.getSession());
//     //     for(String codeName: words){
//     //         if(codeName == secCode){
//     //             return "redirect/codes";
//     //         }else {
//     //             return "redirect:/code";
//     //         }
//     //     }
//         return "trycode";
//     }
// }