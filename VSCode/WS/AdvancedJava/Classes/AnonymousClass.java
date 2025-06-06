package WS.AdvancedJava.Classes;

class A{
    public void show(){
        System.out.println("A's show method");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        // Creating an anonymous class that extends A
        A a = new A() {
            @Override
            public void show() {
                System.out.println("Anonymous class's show method");
            }
        };
        
        // Calling the show method of the anonymous class
        a.show();
    }
}