package com.acf.SpringBootFirstDemo.service;

import com.acf.SpringBootFirstDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop() {
        System.out.println("Adding a laptop");
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
