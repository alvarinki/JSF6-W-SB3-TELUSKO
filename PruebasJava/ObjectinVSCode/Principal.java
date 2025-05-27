package PruebasJava.ObjectinVSCode;

class Calculator {
    
    int a = 0;
    int b = 0;

    // Constructor para inicializar los valores de a y b
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Constructor por defecto
    public Calculator() {}
}

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculator
        Calculator calculator = new Calculator(5, 10);
        
        // Imprimir los valores de a y b
        System.out.println("Valor de a: " + calculator.a);
        System.out.println("Valor de b: " + calculator.b);
        
        // Crear otra instancia usando el constructor por defecto
        Calculator defaultCalculator = new Calculator();
        
        // Imprimir los valores de a y b para la instancia por defecto
        System.out.println("Valor de a (por defecto): " + defaultCalculator.a);
        System.out.println("Valor de b (por defecto): " + defaultCalculator.b);
    }
}
