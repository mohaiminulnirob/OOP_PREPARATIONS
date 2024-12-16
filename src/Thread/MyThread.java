package Thread;

public class MyThread implements Runnable{
    Thread t;
    String s;
    CallMe c;
    MyThread(String s, CallMe c){
       t= new Thread(this,s);
       this.c=c;
       t.start();
    }
    public void run(){
        try{
//            for(int i=0;i<5;i++){
//                System.out.println(i);
//            }
            c.call();
        }catch ( Exception e){
            System.out.println(s+" is interrupted");
        }
        System.out.println("exiting");
    }

}
