package lab7;

public class Student extends Person{
    int reg_no;
    String session;
   public Student(String name,int age,int reg_no,String session){
       //super(name,age);
        super.name=name;
        super.age=age;
        this.reg_no=reg_no;
        this.session=session;
    }
    public void printDetails(){
        System.out.println("Student reg no: "+reg_no+" , "+"Student session: "+session);
    }
}
