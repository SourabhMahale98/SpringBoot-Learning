package com.springboot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.demo1.Config.AppConfig;

// @SpringBootApplication
// public class Demo1Application {

// 	public static void main(String[] args) {
// 		SpringApplication.run(Demo1Application.class, args);
// 	}

// }

public class Demo1Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();

        Alien a1 = context.getBean(Alien.class);
        System.out.println(a1.getAge());
        a1.code();

    }
}