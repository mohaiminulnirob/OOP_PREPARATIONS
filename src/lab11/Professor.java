package lab11;
import java.util.List;

public class  Professor extends Person {
    public List isOfStudents;
    public double Salary;
    public void applyExamination(){

    }

    public boolean hasParkingPass(){
        return true;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
