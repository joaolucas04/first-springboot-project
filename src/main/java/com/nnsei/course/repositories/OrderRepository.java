package com.nnsei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnsei.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
