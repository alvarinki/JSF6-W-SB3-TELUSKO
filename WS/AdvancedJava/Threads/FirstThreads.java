class A extends Thread{
    
    public void run(){
        for(int i=1; i<=100;i++){
            System.out.println("Hi A");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println("Problemas");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1; i<=100;i++){
            System.out.println("Hi B");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println("Problemas");
            }

        }
    }
}

public class FirstThreads {
    public static void main(String[] args) {
        A objA= new A();
        B objB= new B();

        objA.start();
        objB.start();
    }
}
