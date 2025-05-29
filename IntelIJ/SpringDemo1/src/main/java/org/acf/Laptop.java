package org.acf;

public class Laptop {
    private String brand;
    private String model;

    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Laptop created: " + brand + " " + model);
    }

    public void compile() {
        System.out.println("Compiling code on " + brand + " " + model);
    }

    public Laptop() {
        // Default constructor
    }
}
