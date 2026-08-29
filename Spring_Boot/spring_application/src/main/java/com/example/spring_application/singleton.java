package com.example.spring_application;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class singleton {
    int age;
    public void show(){
        System.out.println("Age is :" + age);
    }
}
