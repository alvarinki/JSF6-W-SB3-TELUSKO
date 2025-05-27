package WS.AdvancedJava.Classes;

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Creating an instance of WagonR
        Car myCar = new WagonR();
        
        // Calling the abstract method
        myCar.drive();
        
        // Calling the concrete method
        myCar.playMusic();
    }
}

abstract class Car {
    // Abstract method
    public abstract void drive();

    // Concrete method
    public void playMusic() {
        System.out.println("Car playing music.");
    }
}

class WagonR extends Car {
    // Implementing the abstract method
    @Override
    public void drive() {
        System.out.println("WagonR is driving.");
    }
}

