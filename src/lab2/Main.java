package lab2;


public class Main {
    public static void main(String[] args) {
        student s1 = new student(101, 25,"A");
        student s2 = new student(102, 26, "B");
        student nirob=new student(103,21,"nirob");
        System.out.println(nirob.getName());
        System.out.println(s2.setName("C"));
    }
}