package com.acf.SpringBootFirstDemo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Desktop implements Computer{

    public void compile(){
        System.out.println("Compiling on Desktop");
    }

}
