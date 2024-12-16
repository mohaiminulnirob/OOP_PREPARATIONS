package lab5;

public class teacher extends person{

    public teacher(String name,int age,int teacher_id,int joining_year){
        super(name,age);
        //super.name=name;
        //super.age=age;
        this.teacher_id=teacher_id;
        this.joining_year=joining_year;
    }
    int teacher_id;
    int joining_year;
    static student s1=new student("abc",25,2021831049,"2021");
    static void print(){

        //System.out.println(s1.age);
    }

}
