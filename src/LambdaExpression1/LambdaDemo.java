package LambdaExpression1;

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest ans=(n)->{
            n+=10;
            n-=10;
            if(n%2==0)
                return true;
            else return false;
        };
        boolean x= ans.test(5);
        boolean y=ans.test(6);
        System.out.println(x+" , "+y);
    }
}
