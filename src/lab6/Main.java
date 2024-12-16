package lab6;

public class Main {
    public static void main(String[] args) {
        animal Animal;
        //making object of animal is unnecessary
        //abstract object helps in inheritence
     Animal=new dog();
     Animal.makesound();
        //((dog)animal).chasecat();

     cat Cat =new cat();
     Animal=Cat;
     Animal.makesound();
     Cat.chasemouse();
     //we can call uninherited method by typecasting//((Cat)Animal.chasemouse();
    }
}
//method overriding
// Method overriding occurs only when the names and the type signatures of the two
// methods are identical. If they are not, then the two methods are simply overloaded.
//dynamic method dispatch/run time polymorphism(one interface,multiple method->
// aspect of polymorphism)
//making abstract class
// There can be no objects of an abstract class. That is,
//an abstract class cannot be directly instantiated with the new operator. Such objects would
//be useless, because an abstract class is not fully defined. Also, you cannot declare abstract
//constructors, or abstract static methods. Any subclass of an abstract class must either implement
//all of the abstract methods in the superclass, or be itself declared abstract
//Although abstract classes cannot be used to instantiate objects, they can be used to create
//object references, because Java’s approach to run-time polymorphism is implemented through
//the use of superclass references. Thus, it must be possible to create a reference to an abstract
//class so that it can be used to point to a subclass object. You will see this feature put to use in
//the next example
//package
//interface
//Variables can be declared inside of interface declarations. They are implicitly final and
//static, meaning they cannot be changed by the implementing class. They must also be
//initialized. All methods and variables are implicitly public.