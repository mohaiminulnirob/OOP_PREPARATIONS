package ExceptionHandling;

public class MyException extends Exception{
    String s;
    MyException(String s){
        this.s=s;
    }
    @Override
    public String toString() {
        return s;
    }

}
