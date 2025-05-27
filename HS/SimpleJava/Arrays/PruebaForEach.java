package HS.SimpleJava.Arrays;

public class PruebaForEach {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Convertir el array a una lista para usar forEach
        java.util.Arrays.stream(numeros).forEach(n -> System.out.println("Número: " + n));
        System.out.println("Array entero: "+ java.util.Arrays.toString(numeros));
    }
}
