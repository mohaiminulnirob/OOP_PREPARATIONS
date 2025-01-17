package LambdaExpression;

public class ThreadByLambda {
    public static void main(String[] args) {
        //thread example with anonymous class
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running...");
        };
        //Runnable r2=()-> System.out.println("Thread 2 is running");
        Thread t2=new Thread(r2);
        t2.start();
    }
}
