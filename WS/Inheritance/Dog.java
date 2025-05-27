package WS.Inheritance;

public class Dog {

    private String name;
    private int chipNumber;
    private String breed;

    public Dog(String name, int chipNumber, String breed) {
        this.name = name;
        this.chipNumber = chipNumber;
        this.breed = breed;
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }
    public int getChipNumber() {
        return chipNumber;
    }
    public void setChipNumber(int chipNumber) {
        this.chipNumber = chipNumber;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
