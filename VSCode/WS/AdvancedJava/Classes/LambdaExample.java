package WS.AdvancedJava.Classes;

public class LambdaExample {
    public static void main(String[] args) {
        A obj = (i, j) -> i+j;

        System.out.println(obj.show(3, 4));
       
    }
}


interface A {
        int show(int i, int j);
    }
