package lab14;

public class Main {
    public static void main(String[] args) {
        MathOperation addition= (a,b)->a+b;
        MathOperation subtraction= (a,b)->a-b;
        MathOperation HeavyCalculationHobe=(a,b)->{
            int c=a%5+b+100;
            return c;
        };
        System.out.println(addition.operation(1,5));

    }
}
//the class of addition is anonymous class(wrong)
//can also be implemented by anonymous class

