class A implements Runnable{
    
    public void run(){
        for(int i=1; i<=5;i++){
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
class B implements Runnable{
    public void run(){
        for(int i=1; i<=5;i++){
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

public class RunnableVSThread {
    public static void main(String[] args) {

        Runnable obj3 = new Runnable() {
            public void run(){
        for(int i=1; i<=5;i++){
                System.out.println("Hi B");
                    try{
                        Thread.sleep(10);
                    }
                    catch(Exception e){
                        System.out.println("Problemas");
                    }

                }
            }
        };
        
        Runnable obj4 = new Runnable() {
            public void run(){
        for(int i=1; i<=5;i++){
                System.out.println("Hi B");
                    try{
                        Thread.sleep(10);
                    }
                    catch(Exception e){
                        System.out.println("Problemas");
                    }

                }
            }
        };

        Runnable objA= new A();
        Runnable objB= new B();

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
    }
}
