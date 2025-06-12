package org.acf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {

    @Value("21") //Value injection
    private int age;

    @Autowired //Field injection
    //@Qualifier("laptop") o primary
    private Computer com;

    // Constructor injection
//    public Person(@Autowired @Qualifier("laptop") Computer com) {
//        this.com = com;
//        System.out.println("Person constructor with Computer called");
//    }

    //Setter injection
//    public void setCom(@Qualifier("laptop") Computer com) {
//        this.com = com;
//        System.out.println("Person setter for Computer called");
//    }

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
