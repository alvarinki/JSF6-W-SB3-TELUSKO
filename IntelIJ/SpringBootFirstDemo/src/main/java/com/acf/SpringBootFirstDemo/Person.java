package com.acf.SpringBootFirstDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    Laptop laptop;

    public void code(){
        System.out.println("I am coding in Java!");
    }
}
