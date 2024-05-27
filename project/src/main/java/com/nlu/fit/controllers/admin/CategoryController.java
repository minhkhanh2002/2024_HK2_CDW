package com.nlu.fit.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller

public class CategoryController {

	@RequestMapping("admin/category")
	
	public String index() {
		
		return "admin/category/index";
	}
	@RequestMapping("admin/add-category")
	public String add() {
		return "admin/category/add";
	}
	
	
}
