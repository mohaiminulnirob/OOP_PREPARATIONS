package lab7;

public abstract class Person {

    public String name;
    public int age;
//    public Person(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
    void getName(){
        System.out.println(name);
    }
    void getAge(){
        System.out.print(this.age);
    }

    public void printDetails(){
        System.out.println("the details");
    }
}
