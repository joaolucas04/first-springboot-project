package com.nnsei.course.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnsei.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u1 = new User(1L, "Soyeon", "soyeon@gmail.com", "123456789", "soyeon123");
		User u2 = new User(2L, "Jisoo", "jisoo@gmail.com", "99999999", "jsioobp");
		User u3 = new User(3L, "Sowon", "sowon@gmail.com", "9123132", "gfriend123");
		List<User> list = new ArrayList<>();
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		return ResponseEntity.ok().body(list);
	}
	
	
}
