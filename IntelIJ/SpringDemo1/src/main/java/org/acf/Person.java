package org.acf;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {

    private int age;
    private Computer com;

    public void code() {
        System.out.println("I am coding!");
        com.compile();
    }

    public Person() {
        System.out.println("Person constructor called");
    }

//    public Person (int age) {
//        this.age = age;
//        System.out.println("Person constructor with parameters called");
//    }

//    public Person(Laptop lap, int age) {
//        this.lap = lap;
//        this.age = age;
//        System.out.println("Person constructor with Laptop and age called");
//    }
}
