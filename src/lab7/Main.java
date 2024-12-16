package lab7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person;
        Student student=new Student("nirob",22,2021831049,"2021");
        Teacher teacher=new Teacher("Raihan Sir",27,20254,2020);
        person=student;
        //System.out.println("name: "+person.getName()+" , "+"age: "+person.getAge()+);
        person.printDetails();
        person=teacher;
        System.out.println("Name: ");
        person.getName();
        person.printDetails();
    }
}
//java swing/java fx-> calculation app
