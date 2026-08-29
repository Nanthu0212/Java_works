package com.example.spring_application;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class prototype {
    int age;
    public void show(){
        System.out.println("Age is :" + age);
    }
}
