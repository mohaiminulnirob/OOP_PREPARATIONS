package LambdaExpression1;

public class GenericLambdaDemo {
    public static void main(String[] args) {
        GenericTest<String> prntStr=(s)->{
            System.out.println("The string is "+s);
        };
        prntStr.func("Bangladesh");
    }
}
