package com.dojo.survey.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

        @RequestMapping(value="/")
        public String homeIndex(String hw, Model model) {
            ArrayList<String> languagesList = new ArrayList<String>();
            languagesList.add("Python");
            languagesList.add("Java");
            languagesList.add("JavaScript");
            languagesList.add("SQL");
            return "index.jsp";
        }
        
        @RequestMapping(value="/result", method=RequestMethod.POST)
        public String requestMethodName(@RequestParam(value="fullname", required = false) String fullName, 
        @RequestParam(value="dojoLocations", required = false) String dojoLocations, 
        @RequestParam(value="progList", required=false) String progList,
        @RequestParam(value="progName", required=false) String progName, 
        HttpSession session, Model model) {
            model.addAttribute("fullName", fullName);
            model.addAttribute("dojoLocations", dojoLocations);
            model.addAttribute("progList", progList);
            System.out.println(progList);
            
            return "result.jsp";
        }
        
}