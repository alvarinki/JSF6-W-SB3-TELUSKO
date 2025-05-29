package org.acf;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {

    int age;
    Laptop lap;

    public void code() {
        System.out.println("I am coding in Java!");
    }

    public Person() {
        System.out.println("Person constructor called");
    }

    public Person (int age) {
        this.age = age;
        System.out.println("Person constructor with parameters called");
    }
}
