package com.nlu.fit.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nlu.fit.models.Category;

public interface CategoryService {
	List<Category> getAll();
	boolean create(Category category);
	Category findById(Integer id);
	boolean delete(Integer id);
	boolean update(Category category);
	List<Category> searchCategory(String keyword);
	
	Page<Category> getAll(Integer pageNo);
	
}
