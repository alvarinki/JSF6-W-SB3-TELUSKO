package org.acf;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling code on Laptop");
    }
}


    //        System.out.println("Laptop created");
//    public Laptop() {
//    private String brand;
//    private String model;
//
//    public Laptop(String brand, String model) {
//        this.brand = brand;
//        this.model = model;
//        System.out.println("Laptop created: " + brand + " " + model);
//    }

