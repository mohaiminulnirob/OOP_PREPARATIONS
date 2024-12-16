package lab5;

public class Main {
    public static void main(String[] args){
        student s1=new student("abc",25,2021831049,"2021");
        teacher.print();
        //System.out.println(s1.name);
    }
}
//inheritance basic(extends)
//member access and inheritance
//superclass variable can be a reference to a subclass object(common members are only accessible)
//private members of super class can be accessible by super()
//super has two general forms. The first calls the superclass’ constructor. The second is
// used to access a member of the superclass that has been hidden by a member of a subclass.
// Creating a Multilevel Hierarchy
// super( ) always refers to the constructor in the closest superclass.
// constructors are called in order of derivation, from superclass to subclass
//using final to prevent inheritance( The compiler is free to inline calls to them because it “knows” they will not be overridden
// by a subclass.(early binding)
//run-time(late-binding)
