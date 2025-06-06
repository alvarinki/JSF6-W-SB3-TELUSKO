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

        Desktop dt = context.getBean("desktop", Desktop.class);
        System.out.println("Got it!!");
        dt.compile();
    }
}

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Person person =context.getBean("Person", Person.class);
//        System.out.println("Person age: " + person.getAge());
//        person.code();
