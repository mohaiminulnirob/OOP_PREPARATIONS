package Thread;

public class Main {
    public static void main(String[] args) {
        CallMe c=new CallMe();
        MyThread mt=new MyThread("My Thread",c);
        MyThread mt1=new MyThread("My Thread1",c);
        System.out.println(mt.t.isAlive());
        for(int i=5;i<10;i++){
            //System.out.println(i);
            try {
                Thread.sleep(0);
                mt.t.join();
                mt1.t.join();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(mt.t.isAlive());
        System.out.println("Main thread exiting");

    }
}
//book + slide + java point
//note
