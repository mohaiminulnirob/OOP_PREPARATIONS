package lab3;

public class Student {
    int age;
    int roll_no;
    String name;

    //polymorphism
    //constructor overloading
    public Student(int age){

        this.age=age;
    }
    public Student(int age,int roll_no){
        this.age=age;
        this.roll_no=roll_no;
    }

    //method overloading

    //different number of parameters or different parameter data type
    int add(int a,int b){

        return a+b;
    }
    int add(int a,int b,int c){

        return a+b+c;
    }

    //different method signature
    double add(int a){

        return 0.0;
    }

}