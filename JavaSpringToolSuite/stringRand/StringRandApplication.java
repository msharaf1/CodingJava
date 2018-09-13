package com.codingspacex.ship;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringRandApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringRandApplication.class, args);
	}
	@RequestMapping("/")
	public String helloRandom() {
		return "Hello World";
//	    int leftLimit = 97; // letter 'a'
//	    int rightLimit = 122; // letter 'z'
//	    int targetStringLength = 25;
//	    Random random = new Random();
//	    StringBuilder buffer = new StringBuilder(targetStringLength);
//	    for (int i = 0; i < targetStringLength; i++) {
//	        int randomLimitedInt = leftLimit + (int) 
//	          (random.nextFloat() * (rightLimit - leftLimit + 1));
//	        buffer.append((char) randomLimitedInt);
//	    }
//	    String generatedString = buffer.toString();
//	 
//	    System.out.println(generatedString);
//	    return generatedString;
	}
	
	@RequestMapping("/rand")
	public String randHello() {
		return "Thank you for visiting my randWord address.";
	}
	
	@RequestMapping("/cloud")
	public String cloudAdd() {
		return "Hello Darling";
	}

}
