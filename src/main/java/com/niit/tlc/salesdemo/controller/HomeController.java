package com.niit.tlc.salesdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class HomeController {

	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}
	

	@RequestMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
}

