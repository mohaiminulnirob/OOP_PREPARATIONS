package OOPLABFINAL.LabFinalEven;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("12", "Sylhet", "Sylhet", 62704, "BD");
        Address address1 = new Address("15", "Springfield", "IL", 62704, "USA");

        Student student = new Student(
                "John Doe",
                "123-456-7890",
                "john.doe@example.com",
                address,
                1001,
                75
        );

        Professor professor = new Professor(
                "Dr. Smith",
                "987-654-3210",
                "smith@example.com",
                address1,
                90000,
                1234,
                10,
                3
        );

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getAdreess());
        System.out.println("Eligible to Enroll: " + student.isEligibleToEnroll());

        System.out.println("\nProfessor Details:");
        System.out.println("Name: " + professor.getAdreess());
        System.out.println("Number of Classes: " + professor.getNumberOfClasses());
    }
}

