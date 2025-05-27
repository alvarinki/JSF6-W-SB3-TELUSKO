abstract class A{
    public abstract void show();
}

public class AbstractAnonymousClass {
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