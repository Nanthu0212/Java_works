package com.example.spring_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		singleton single_1 = context.getBean(singleton.class);
		single_1.age = 25;
		singleton single_2 = context.getBean(singleton.class);
		single_2.age = single_1.age *2 ;
		System.out.println("First value of singleton   :"+ single_1.age);
		System.out.println("Secound value of singleton :"+ single_2.age);
		prototype proto_1 = context.getBean(prototype.class);
		proto_1.age = 35 ;
		prototype proto_2 = context.getBean(prototype.class);
		proto_2.age = 70 ;
		System.out.println("First value of prototype   :"+ proto_1.age);
		System.out.println("Secound value of prototype :"+ proto_2.age);

	}

}
