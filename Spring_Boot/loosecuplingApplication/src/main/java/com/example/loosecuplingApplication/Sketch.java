package com.example.loosecuplingApplication;

import org.springframework.stereotype.Component;

@Component
public class Sketch implements writertool{
    public void write() {
        System.out.println("Writing using Sketch");
    }

}