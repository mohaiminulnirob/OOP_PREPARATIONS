package lab1;

import  java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Student nirob=new Student();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the reg: ");
        nirob.reg_no=sc.nextInt();

        sc.nextLine();   //this will capture the "enter".
        System.out.println("Enter the name: ");
        nirob.name =sc.nextLine();


        System.out.println("Enter the email: ");
        nirob.email=sc.nextLine();

        System.out.println(nirob.name);
        System.out.println(nirob.reg_no);
        System.out.println(nirob.email);
    }
}
//java buzzwords:
//• Simple
// • Secure
// • Portable
// • Object-oriented
// • Robust
// • Multithreaded
// • Architecture-neutral
// • Interpreted
// • High performance
// • Distributed
// • Dynamic
//the magic of bytecode
//principles of oop
