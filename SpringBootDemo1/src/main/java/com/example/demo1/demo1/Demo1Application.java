package com.example.demo1.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(Demo1Application.class, args);

		Alien a1 = contex.getBean(Alien.class);
		System.out.println(a1.getAge());
		a1.code();

	}

}
