package com.udemy.springseleniumDemo;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;
import java.security.SecureRandom;
import java.util.List;

@SpringBootTest
class SpringSeleniumDemoApplicationTests {

	@Autowired
	private User user;

	//Reading value from property file
	@Value("${fruits}")
	private List<String>fruits;

	@Value("${username}")
	private String username;

	@Autowired
	private Faker faker;

	@Autowired
    private Televsion tv;


	@Test
	void contextLoads() throws InterruptedException {

	user.printDetails();
		System.out.println(this.fruits);
		System.out.println(this.fruits.size());
		System.out.println(this.username);
        System.out.println(this.faker.name().fullName());
        this.tv.playMovie();
	}
		/*Address address = new Address();
		Salary salary = new Salary();
		User user = new User(salary, address);
		user.printDetails();*/
}
