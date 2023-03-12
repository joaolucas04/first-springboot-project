package com.nnsei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnsei.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
