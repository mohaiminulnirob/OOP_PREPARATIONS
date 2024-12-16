package lab3;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(20);
        Student s2 = new Student(20, 101);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s2.age+" "+s2.roll_no);
    }
}
//class,object,constructor,method,this keyword,constructor overloading,method overloading
// A class creates a new data type that can be used to create objects. That is, a class creates a logical framework
// that defines the relationship between its members. When you declare an object of a class, you
// are creating an instance of that class.
//a class is a template for an object, and an object is an instance of a class.
//methods and variables(instance variables) defined within a class are called members of the clas
//methods and variables defined within a class are called members of the clas
//when you create a class, you are creating a new data type.
//primitive type & object variable type
//implicit return type of a class’s constructor is the class type itself
//this keyword
//this is always a reference to the object on which the method was invoked.
//garbage collection. It works like this: when no  references to an object exist, that object is assumed to be no longer needed, and the memory
// occupied by the object can be reclaimed
//method/constructor overloading
//call by value(primitive type passing),call by reference(object passing)
// The object will continue to exist as long as there is a reference to it somewhere in your program
//access control(public,private,protected,default)
//When a member is declared static, it can be accessed before any objects of its class are created
// Methods declared as static have several restrictions:
// • They can only call other static methods.
// • They must only access static data.
// • They cannot refer to this or super in any way
//calling static method-> classname.method()
//only inner classes can be static
//if object is created static members will be common
//static block
// A static variable can be accessed in the same way—by use of the dot operator on
//the name of the class. This is how Java implements a controlled version of global methods
//and global variables.
// final(const)
//final variables can be initialized static method/constructors and can not be modified
//final method can not be overridden
//final class can not be inherited,we can use objects of that class
//inner(non-static),outer class
//singleton class