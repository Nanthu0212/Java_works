package com.example.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class protopype {
    int age;
    public void show(){
        System.out.println("Age is :" + age);
    }
}
