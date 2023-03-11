package com.nnsei.course.config;

import java.time.Instant;
import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nnsei.course.entities.Order;
import com.nnsei.course.entities.User;
import com.nnsei.course.repositories.OrderRepository;
import com.nnsei.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Yuju", "yuju@gmail.com", "312432432", "12345612");
		User u2 = new User(null, "Sowon", "sowon@gmail.com", "977432421", "12345634");
		User u3 = new User(null, "Yerin", "yerin@gmail.com", "12349520", "abcdefg");
		User u4 = new User(null, "SinB", "sinb@gmail.com", "821432", "eunbi123");
		User u5 = new User(null, "Umji", "umji@gmail.com", "13423098", "umjiviviz");
		User u6 = new User(null, "Eunha", "eunha@gmail.com", "432890432", "eunha321");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u3);
		Order o4 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u4);
		Order o5 = new Order(null, Instant.parse("2019-01-21T03:42:10Z"), u5);
		Order o6 = new Order(null, Instant.parse("2019-03-22T15:21:22Z"), u6);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
	} 
}
