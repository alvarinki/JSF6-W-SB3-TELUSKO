public class RunnableVSThread {
    public static void main(String[] args) {

        Runnable obj3 = new Runnable() {
            public void run(){
                for(int i=1; i<=5;i++){
                        System.out.println("Hi 3");
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
                System.out.println("Hi 4");
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

        //Thread t1 = new Thread(objA);
        //Thread t2 = new Thread(objB);
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        //t1.start();
        //t2.start();
        t3.start();
        t4.start();
    }
}

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