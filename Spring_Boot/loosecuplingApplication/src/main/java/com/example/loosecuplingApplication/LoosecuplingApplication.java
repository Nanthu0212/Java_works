package com.example.loosecuplingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoosecuplingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LoosecuplingApplication.class, args);
		student s = context.getBean(student.class);
		s.writeExam();
	}

}
