package lab4;

public class useStatic {
    static int a=2;
    static int b;
    static void meth(int x) {
        System.out.println("x= " + x);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
    static {
        b = a * 4;
    }

}
