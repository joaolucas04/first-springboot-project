package com.nnsei.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nnsei.course.entities.Category;
import com.nnsei.course.entities.Order;
import com.nnsei.course.entities.Product;
import com.nnsei.course.entities.User;
import com.nnsei.course.entities.enums.OrderStatus;
import com.nnsei.course.repositories.CategoryRepository;
import com.nnsei.course.repositories.OrderRepository;
import com.nnsei.course.repositories.ProductRepository;
import com.nnsei.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		
		User u1 = new User(null, "Yuju", "yuju@gmail.com", "312432432", "12345612");
		User u2 = new User(null, "Sowon", "sowon@gmail.com", "977432421", "12345634");
		User u3 = new User(null, "Yerin", "yerin@gmail.com", "12349520", "abcdefg");
		User u4 = new User(null, "SinB", "sinb@gmail.com", "821432", "eunbi123");
		User u5 = new User(null, "Umji", "umji@gmail.com", "13423098", "umjiviviz");
		User u6 = new User(null, "Eunha", "eunha@gmail.com", "432890432", "eunha321");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.CANCELLED);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u3, OrderStatus.PAID);
		Order o4 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u4, OrderStatus.SHIPPED);
		Order o5 = new Order(null, Instant.parse("2019-01-21T03:42:10Z"), u5, OrderStatus.DELIVERED);
		Order o6 = new Order(null, Instant.parse("2019-03-22T15:21:22Z"), u6, OrderStatus.DELIVERED);
		
		Product p1 = new Product(null, "GFRIEND ALBUM Walpurgis Night", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "GFRIEND ALBUM Snow Flake", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "DREAMCATCHER ALBUM Alone in the City", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	} 
}
