package LambdaExpression1;

public interface NumericTest {
    boolean test(int n);
    default int b(){
        return 1;
    }
    static int c(){
        return 2;
    }
    private int d(){
        return 3;
    }
}

