package com.fitzgerald.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String saySomethingAboutPython() {
		return "Python/Flask was awesome!";			
	}
	
	@RequestMapping("/java")
	public String saySomethingAboutJava() {
		return "Java/Spring is better!(And I MEAN it :)";
	}	
	
}
