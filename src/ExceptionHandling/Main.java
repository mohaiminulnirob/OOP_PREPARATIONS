package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        Function s=new Function();
        try{
            s.op();
        }catch (IllegalAccessException e){
            System.out.println(e);
        }
    }
}
//book + java-point
//lab 10