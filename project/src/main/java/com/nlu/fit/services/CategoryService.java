package com.nlu.fit.services;

import java.util.List;

import com.nlu.fit.models.Category;

public interface CategoryService {
	List<Category> getAll();
	boolean create(Category category);
	Category findById(Integer id);
	boolean delete(Category category);
	boolean update(Category category);
}
