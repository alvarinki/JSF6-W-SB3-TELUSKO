package HS.SimpleJava.Ternario;

class TernarioDemo {
    public static void main(String a[]) {
        int n = 10;
        int b = 20;

        // Usando el operador ternario para determinar el mayor de dos números
        int mayor = (n > b) ? n : b;

        // Imprimir el resultado
        System.out.println("El mayor de " + n + " y " + b + " es: " + mayor);
    }
}