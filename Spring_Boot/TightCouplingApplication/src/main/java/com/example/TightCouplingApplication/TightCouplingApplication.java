package com.example.TightCouplingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TightCouplingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TightCouplingApplication.class, args);
		Student s = context.getBean(Student.class);
		s.writeExam();
	}

}
