package com.nlu.fit.services;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	void store(MultipartFile file);

	void init();

	
	
}
