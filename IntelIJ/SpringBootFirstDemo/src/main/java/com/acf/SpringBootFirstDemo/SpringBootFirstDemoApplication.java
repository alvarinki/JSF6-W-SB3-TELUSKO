package com.acf.SpringBootFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootFirstDemoApplication.class, args);
		System.out.println("Spring Boot First Demo Application is running!");

		Person person= context.getBean(Person.class);
		person.code();
	}

}
