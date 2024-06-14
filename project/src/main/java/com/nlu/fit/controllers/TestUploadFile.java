package com.nlu.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nlu.fit.services.StorageService;

import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/upload-test")
public class TestUploadFile {
	@Autowired
	private StorageService storageService;
	
	@GetMapping
	public String uploadDemo() {
		return "test-upload";
	}
	@PostMapping
	public String save(@RequestParam("file") MultipartFile file) {
		this.storageService.store(file);
		return "test-upload";
	}
	

}
