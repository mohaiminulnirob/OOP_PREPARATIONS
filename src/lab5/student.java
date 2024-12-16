package lab5;

public class student extends person{

    int reg_no;
    String session;
    public student(String name,int age,int reg_no,String session){
        super(name,age);//must be first statement//uses the constructor of superclass
        //super.name=name;//when the sup & sub class has the member of same name,another use this.name
        //super.age=age;
        this.reg_no=reg_no;
        this.session=session;
    }

}
