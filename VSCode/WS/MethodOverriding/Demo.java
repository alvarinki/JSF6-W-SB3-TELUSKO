package WS.MethodOverriding;

class A{
    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("in A config ");
    }

    public int add(int n1, int n2){
        return n1+n2;
    }
}

class B extends A{

    @Override
    public void show(){
        
        System.out.println("in B show");
    }

    @Override 
    public int add(int n1, int n2){
        return n1+n2+3;
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj= new B();
        int r1= obj.add(1, 2);
        System.out.println("Número: "+r1);
    }
    
}
