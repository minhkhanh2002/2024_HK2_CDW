package com.nlu.fit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nlu.fit.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
