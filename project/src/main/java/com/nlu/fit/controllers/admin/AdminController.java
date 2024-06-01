package com.nlu.fit.controllers.admin;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nlu.fit.models.CustomUserDetails;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping
	public String index() {
		return "redirect:/admin/";
	}
	
	@RequestMapping("/")
	public String admin() {
		
		return "admin/index";
	}
	
//	@RequestMapping("/")
//	public String adminPage() {
//		model.addAttribute("mess", "Welcome to Admin Page");
//		
//		CustomUserDetails user =  (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		model.addAttribute("user", user);
//		return "admin/index";
//	}
}
