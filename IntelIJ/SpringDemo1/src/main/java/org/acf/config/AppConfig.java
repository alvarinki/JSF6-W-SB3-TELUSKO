package org.acf.config;

import org.acf.Computer;
import org.acf.Desktop;
import org.acf.Laptop;
import org.acf.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.acf") // Scans the package for components
public class AppConfig {

    //Si escribes @ComponentScan en esta clase y @Component en cada una de las clases no es necesario crear los beans manualmente aquí.

//    @Bean
//    //public Person person(@Autowired Computer com){ Para el caso de que quiera que se relacione automáticamente con el bean Computer si solo hay uno de ese tipo.
//    //Sino hay conflictos y requiero de primary o qualifier
//    //Qualifier("desktop") para que se relacione con el bean Desktop directamente por el nombre
//    public Person person(@Qualifier("laptop") Computer com) {
//        Person person= new Person();
//        person.setAge(21);
//        person.setCom(com);
//        return person;
//    }
//
//    //@Bean(name= {"principalDesktop", "desktopBean"})
//    //@Bean(name= {"principalDesktop", "desktopBean"})
//    @Bean
//    //@Scope("prototype") // singleton by default
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    //@Primary para que vaya directamente a por el bean laptop en el caso de dudar entre varias beans del tipo Computer
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
