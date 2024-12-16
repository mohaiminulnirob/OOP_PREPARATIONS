package LambdaExpression;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //anonymous class
        Polygon p=new Polygon(){
            public void Area(){
                System.out.println("a");
                System.out.println("Area");
            }

        };
        p.Area();

        Addition addition=(a,b)->a+b;
        double y=addition.add(10,5);
        System.out.println(y);
        Addition additon2=(a,b)->{
            System.out.println(a+b);
            return 0;
        };
        additon2.add(10,6);
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("m");
        list.add("i");
        list.add("j");

        list.forEach(
                (n)->System.out.println(n)
        );

    }
}
//In simple words, a class that has no name is known as an anonymous inner class in Java.
// It should be used if you have to override a method of class or interface.
// Java Anonymous inner class can be created in two ways:
//Class(it may be abstract or concrete).
//Interface
//A class is created, but its name is decided by the compiler, which extends the Polygon class and provides the implementation of the Area() method.
//An object of the Anonymous class is created that is referred to by 'p,' a reference variable of Polygon type
//The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code.
// In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.
//An interface which has only one abstract method is called functional interface.
//Why use Lambda Expression
//To provide the implementation of Functional interface.
//Less coding.
//Java Lambda Expression Syntax
//(argument-list) -> {body};
//A lambda expression is, essentially, an anonymous (that is, unnamed) method. However,
//this method is not executed on its own. Instead, it is used to implement a method defined by
//a functional interface. Thus, a lambda expression results in a form of anonymous class.
//Lambda expressions are also commonly referred to as closures
//A functional interface is an interface that contains one and only one abstract method.
//Runnable is a
//functional interface because it defines only one method: run( ). Therefore, run( ) defines the
//action of Runnable
//. One other thing: a functional interface is sometimes referred to as a
//SAM type, where SAM stands for Single Abstract Method
//d to as the lambda operator or the arrow operator, is −>.
//It divides a lambda expression into two parts. The left side specifies any parameters required
//by the lambda expression. (If no parameters are needed, an empty parameter list is used.) On
//the right side is the lambda body, which specifies the actions of the lambda expression. The
//−> can be verbalized as “becomes” or “goes to.
//lab 14