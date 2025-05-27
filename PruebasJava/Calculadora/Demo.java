class Calculadora {
    
    int a = 0;
    int b = 0;

    // Constructor para inicializar los valores de a y b
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Constructor por defecto
    public Calculadora() {}
}

public class Demo {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora
        Calculadora calculadora = new Calculadora(5, 10);
        
        // Imprimir los valores de a y b
        System.out.println("Valor de a: " + calculadora.a);
        System.out.println("Valor de b: " + calculadora.b);
        
        // Crear otra instancia usando el constructor por defecto
        Calculadora calculadoraPorDefecto = new Calculadora();
        
        // Imprimir los valores de a y b para la instancia por defecto
        System.out.println("Valor de a (por defecto): " + calculadoraPorDefecto.a);
        System.out.println("Valor de b (por defecto): " + calculadoraPorDefecto.b);
    }
}
