package com.example.TightCouplingApplication;

import org.springframework.stereotype.Component;

@Component
public class pen {
    public void write(){
        System.out.println("Writing with pen ");
    }
}
