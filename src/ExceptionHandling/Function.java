package ExceptionHandling;

public class Function {
    public void op() throws IllegalAccessException{
        MyException sss=new MyException("This is my exception");
        sss.initCause(new ArithmeticException());
        try {
            for (int i = 0; i < 10; i++) {
                if(i==9)
                   throw sss;

            }
        }catch(MyException e){
            System.out.println(e+ " "+ e.getCause());
        }
        finally {
            throw new IllegalAccessException();
        }
    }
}
