package com.nnsei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnsei.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
