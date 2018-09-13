package com.codingspacex.ship;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String spaceX() {
		return "Welcome Human";
	}
	
	@RequestMapping("/searchname")
	public String searchName(@RequestParam(value="name", required = false) String searchedName) {
		if(searchedName == null) {
			return "Welcome to Human";
		}else {return "Welcome Dear: " + searchedName;
			}
	}
	
}
