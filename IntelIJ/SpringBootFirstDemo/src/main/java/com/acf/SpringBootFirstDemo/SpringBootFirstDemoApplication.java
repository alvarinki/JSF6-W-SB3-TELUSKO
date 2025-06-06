package com.acf.SpringBootFirstDemo;

import com.acf.SpringBootFirstDemo.model.Laptop;
import com.acf.SpringBootFirstDemo.model.Person;
import com.acf.SpringBootFirstDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootFirstDemoApplication.class, args);

		LaptopService service= context.getBean(LaptopService.class);
		Laptop lap= context.getBean(Laptop.class);

		service.addLaptop();

	}

}

//System.out.println("Spring Boot First Demo Application is running!");
//
//		Person person= context.getBean(Person.class);
//		person.code();
