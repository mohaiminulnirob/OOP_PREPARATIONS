package Generics1;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob=new Gen<Integer> (88);//autoboxing
        iob.showType();
        int a=iob.getOb();//auto-unboxing
        System.out.println(a);
        //strOb=iob    compile time error
    }
}
