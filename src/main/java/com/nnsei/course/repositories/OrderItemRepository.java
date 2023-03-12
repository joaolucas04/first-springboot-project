package com.nnsei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnsei.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
