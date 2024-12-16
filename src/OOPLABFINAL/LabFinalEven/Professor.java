package OOPLABFINAL.LabFinalEven;


import java.util.ArrayList;

public class Professor extends Person{
    private int salary;
    protected int staffNumber;
    private int yearsOfService;
    public int numberOfClasses;
    ArrayList<Student> supervisedStudents=new ArrayList<>();

    public Professor(String name, String phoneNumber, String emailAddress, Address address, int salary, int staffNumber, int yearsOfService, int numberOfClasses) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
        this.staffNumber = staffNumber;
        this.yearsOfService = yearsOfService;
        this.numberOfClasses = numberOfClasses;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    @Override
    public void purchaseParkingPass() {

    }

    public void supervise(Student student) {

    }
}
