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
		return "Welcome to Space X";
	}
	
	@RequestMapping("/dev")
	public String DevApp(){
		return "Develop your favoriate App";
	}
	
	@RequestMapping(value="/greetings", method=RequestMethod.GET)
	public String greetings() {
		return "My Dear Darling";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam(value="q", required = false) String searchQuery) {
		if(searchQuery ==null) {
			return "Nothing was searched";
		}else {
			return "You searched for: " + searchQuery;
		}
	}
	
	@RequestMapping("/m/{track}/{module}/{lesson}")
	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
		return "Track:" + track + ", Module: " + module +", Lesson: " + lesson;
	}
	
	@RequestMapping("/searchname")
	public String searchName(@RequestParam(value="name", required = false) String searchedName) {
		if(searchedName == null) {
			return "Welcome to Human";
		}else {return "Welcome Dear: " + searchedName;
			}
	}
	
	
}
