package lab11;
import java.util.List;

public class Student extends Person{
    double studentNumber;
    boolean isEligibleToEnroll(Student s){
       return true;
    }

    List getSeminarHistory(){
        List list =null;
        return list;
    }
    void takeExamination(){

    }
    public boolean hasParkingPass(){
        return false;
    }
    public boolean validate(){
        return true;
    }
}
