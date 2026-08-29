package com.example.TightCouplingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    private pen pen;
    public void writeExam(){
        System.out.println("Student is writing exam ");
        pen.write();
    }
}
