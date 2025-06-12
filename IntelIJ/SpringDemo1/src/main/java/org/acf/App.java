package org.acf;

import org.acf.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Person person1= context.getBean("person", Person.class);
        //person1.setAge(21);
        System.out.println("Person age: " + person1.getAge());
        person1.code();

//        Desktop dt = context.getBean("desktop", Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop", Desktop.class);
//        dt1.compile();
    }
}

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Person person =context.getBean("Person", Person.class);
//        System.out.println("Person age: " + person.getAge());
//        person.code();
