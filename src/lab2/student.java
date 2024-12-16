package lab2;
import  java.util.Scanner;
public class student {
    Scanner sc= new Scanner(System.in);
    private int regNo;
    private int age;
    private String name;

    public student(int regNo, int age, String name){ //constructor
        this.regNo = regNo;
        this.age = age;
        this.name = name;
    }

    String getName(){
        this.name=sc.nextLine();
        return this.name;
    }

    int getAge(){

        return this.age;
    }

    int getRegNo(){

        return this.regNo;
    }

    String setName(String name){
        this.name = name;
        return this.name;
    }
}
