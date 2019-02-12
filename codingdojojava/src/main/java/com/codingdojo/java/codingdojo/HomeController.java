package com.codingdojo.java.codingdojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController

@Controller
public class HomeController {
    @RequestMapping("")
    public String getHw(){
        return "index.jsp";
    }

    @RequestMapping("/index")
    public String getSayHI(){
        return "index.html";
    }


}
