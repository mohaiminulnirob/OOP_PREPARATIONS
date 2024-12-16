package lab7;

public class Teacher extends Person{
    int teacher_id;
    int joining_year;
    public Teacher(String name,int age,int teacher_id,int joining_year) {
        //this.name = name;
        //this.age = age;
        //super(name,age);
        this.teacher_id = teacher_id;
        this.joining_year = joining_year;
    }
    public void printDetails(){
        System.out.println("Teacher id: "+teacher_id+" , "+"Teacher joining Year: "+joining_year);
    }
}
