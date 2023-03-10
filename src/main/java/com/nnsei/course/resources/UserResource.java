package com.nnsei.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnsei.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u1 = new User(1L, "Soyeon", "soyeon@gmail.com", "123456789", "soyeon123");
		return ResponseEntity.ok().body(u1);
	}
	
	
}
