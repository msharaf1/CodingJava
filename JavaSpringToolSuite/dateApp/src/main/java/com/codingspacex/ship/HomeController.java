package com.codingspacex.ship;

import java.util.Date;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
//		
		return "home.jsp";
	}
	
	@RequestMapping("/index")
		public String home() {
			
			return "index.html";
		}
	
	@RequestMapping("/date")
	public String datePage(Model model) {
		Date myDate = new Date();
		
		model.addAttribute("Date", myDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timePage(Model model) {
		Date myTime = new Date();
		
		
		model.addAttribute("localTime", myTime);
		return "time.jsp";
	}
}
