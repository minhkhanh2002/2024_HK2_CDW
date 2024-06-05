package com.nlu.fit.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nlu.fit.models.Category;
import com.nlu.fit.services.CategoryService;



@Controller

@RequestMapping("/admin")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@GetMapping("/category")
	public String index(Model model) {
		List<Category> list = this.categoryService.getAll();
		model.addAttribute("list", list);
		return "admin/category/index";
	}
	@RequestMapping("/add-category")
	public String add() {
		return "admin/category/add";
	}
	
	
}
