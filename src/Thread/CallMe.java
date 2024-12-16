package Thread;

public class CallMe {
    public synchronized void call(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
