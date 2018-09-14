package com.codingspacex.ship;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	
	
	
	
	@RequestMapping("/counter")
    public String index(HttpSession session){//param session
        
        Integer count = (Integer) session.getAttribute("count");
        
        
        if(count ==null) {
        	session.setAttribute("count", 1);
        }else {
        	session.setAttribute("count", count+1);
        }
        
        return "tracker.jsp";
    }
   
}
