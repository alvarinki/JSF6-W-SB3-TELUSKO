package WS.Inheritance;

public class Main { 
    public static void main(String[] args) {
        // Create a Mastin object
        Mastin mastin = new Mastin("Rex", 12345, "Mastin", "Brown");

        // Print the Mastin object
        System.out.println(mastin);

        // Change the color of the Mastin
        mastin.setColor("Black");

        // Print the updated Mastin object
        System.out.println(mastin);
    }
    
}
