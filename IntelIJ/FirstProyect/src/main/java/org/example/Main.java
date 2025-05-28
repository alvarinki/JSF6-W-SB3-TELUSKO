package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alien a1= new Alien(1, "Paquito", "Java", null);
        Alien a2= new Alien(2, "Juan", "Python", null);
        Alien a3= new Alien(3, "Ana", "JavaScript", null);

        //Student s1= new Student(8, "Manolo", 39);
        Laptop l1= new Laptop();
        l1.setBrand("Dell");
        l1.setModel("XPS 13");
        l1.setRam(16);
        l1.setLid(1L);


        //Create new Laptop
        Laptop l2= new Laptop();
        l2.setBrand("Apple");
        l2.setModel("MacBook Pro");
        l2.setRam(32);
        l2.setLid(2L);

        Laptop l3= new Laptop();
        l3.setBrand("HP");
        l3.setModel("Spectre x360");
        l3.setRam(16);
        l3.setLid(3L);

        Laptop l4= new Laptop();
        l4.setBrand("Lenovo");
        l4.setModel("ThinkPad X1 Carbon");
        l4.setRam(16);
        l4.setLid(4L);

        List<Laptop> laptopListA2 = List.of(l1, l2, l3);
        List<Laptop> laptopListA3 = List.of(l1, l2, l4);

        a2.setLaptops(laptopListA2);
        a3.setLaptops(laptopListA3);



        List<Laptop> laptopListA1 = List.of(l1, l2);
        //s1.setLaptop(l1);
        a1.setLaptops(laptopListA1);

        Configuration cfg= new org.hibernate.cfg.Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();

        Student s2= null;
        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .addAnnotatedClass(org.example.Alien.class)
                .configure().buildSessionFactory();
                //cfg.buildSessionFactory();
        Session session= sf.openSession();

        Transaction transaction= session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(l4);
        session.merge(a1);
        session.merge(a2);
        session.merge(a3);
        //session.persist(s1);
        //System.out.println(s1);
        //session.merge(s1);
        //s2= session.get(Student.class, 8);
        //System.out.println(s1);
        transaction.commit();
    }
}