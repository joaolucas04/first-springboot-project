package com.nnsei.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnsei.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
