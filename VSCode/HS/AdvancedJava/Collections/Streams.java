package HS.AdvancedJava.Collections;
import java.util.*;
import java.util.function.Consumer;

class Student {
    String name;
    int age;

    public Student(String name) {
        this.name = name;
        this.age = 20;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

public class Streams {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List <String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        List<Student> Students= new ArrayList<Student>();
        // Print each name in uppercase
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
        //Consumer<Integer> con = n -> System.out.println(n);
        //nums.forEach(con);
        
        Students= names.stream()
             .map(name -> new Student(name))
             .toList();

        Students = names.stream().map(Student::new).toList();

        // Print each student
        Students.forEach(System.out::println);

        nums.forEach(n -> System.out.println(n));

        names.forEach(System.out::println);

    }
}


