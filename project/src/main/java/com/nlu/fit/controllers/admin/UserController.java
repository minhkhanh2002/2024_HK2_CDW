package com.nlu.fit.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nlu.fit.models.User;
import com.nlu.fit.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	User _userBean;
	

	@RequestMapping("/logon")
	public String logon() {
		
		return "admin/logon";
	}
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@PostMapping("checklogin")
	public String checkLogin(ModelMap model,@RequestParam("username") String username,
			@RequestParam("password") String password, HttpSession session) {
//		if(_userBean.getUserName().equals(username) && (_userBean.getPassWord().equals(password))){
//			System.out.println("Login Thành Công");
//			return "index";
//		} else {
//			System.out.println("Login Thất Bại");
//		}
		
		if(userService.checkLogin(username, password)) {
			System.out.println("Login Thành Công");
			session.setAttribute("USERNAME", username);
			model.addAttribute("USER", userService.findByUserName(username));
			return "index";
		} else {
			System.out.println("Login Thất Bại");
			model.addAttribute("ERROR", "Tên đăng nhập hoặc mật khẩu không chính xác");
		}
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("USERNAME");
		return "redirect:/";
	}
}
