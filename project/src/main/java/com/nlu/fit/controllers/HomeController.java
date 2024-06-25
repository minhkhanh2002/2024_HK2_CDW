package com.nlu.fit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("")
	
	public String home(HttpSession session) {
		//session = null;
		return "index";
	}
}
