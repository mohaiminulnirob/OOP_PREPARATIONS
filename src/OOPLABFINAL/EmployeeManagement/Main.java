package OOPLABFINAL.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 3000, 5000);
        Employee partTimeEmployee = new PartTimeEmployee(2, "Bob", 80, 20);

        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayInfo();

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayInfo();
    }
}