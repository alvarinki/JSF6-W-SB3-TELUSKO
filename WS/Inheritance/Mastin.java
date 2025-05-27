package WS.Inheritance;
import WS.Inheritance.Mastin;

public class Mastin extends Dog {

    private String color;

    public Mastin(String name, int chipNumber, String breed, String color) {
        super(name, chipNumber, breed);
        this.color = color;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}