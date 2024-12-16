package OOPLABFINAL.LabFinalEven;

import java.util.ArrayList;

public class Student extends Person{
    public int studentNumber;
    public int averageMark;
    ArrayList<Professor> supervisers=new ArrayList<>() ;

    public Student(String name, String phoneNumber, String emailAddress, Address address, int studentNumber, int averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll() {

        return averageMark >= 50;
    }

    @Override
    public void purchaseParkingPass() {
        //
    }

    public int getSeminarsTaken() {
        return 0;
    }
}
