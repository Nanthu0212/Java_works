package com.example.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SingletonApplication.class, args);
		singleton single = context.getBean(singleton.class);
		single.age = 24;
		singleton single_1 = context.getBean(singleton.class);
		single_1.age = 25;
		System.out.println("The 'SINGLETON' result is :");
		System.out.println("First object :" + single.age);
		System.out.println("Second object :" + single_1.age);
		protopype proto = context.getBean(protopype.class);
		proto.age = 20;
		protopype proto_1 = context.getBean(protopype.class);
		proto_1.age = 25;
		System.out.println("The 'PROTOTYPE' result is :");
		System.out.println("First object :" + proto.age);
		System.out.println("Second object :" +proto_1.age);
	}

}
