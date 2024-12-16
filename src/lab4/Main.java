package lab4;

public class Main {
    public static void main(String[] args){
        University university=new University(123);

        university.enroll(2021831049,"SWE223",Coursetype.MAJOR);
        university.enroll(2021831049,"MAT107",Coursetype.MINOR);
        university.enroll(2021831049,"SWE299",Coursetype.OPT);
        university.enroll(2021831049,"SWE250","PARTHA SIR");
        System.out.println("UGCID:"+university.getId());

        useStatic.meth(12);
    }
}
//chapter(1-7)
//public,private,protected(encapsulation)
//protected method can be accessed only through same package
//uses of package:maintainability,easy debug,refactor,reuse,modularity(independent entity)
//static member can be accessed without creating object(example code)
//constructor/static member can be private?(details)(how)
//constructor can be private and so object shuld be in the same class
//static member can also be private