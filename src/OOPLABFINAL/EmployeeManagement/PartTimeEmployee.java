package OOPLABFINAL.EmployeeManagement;

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);  // Part-time employees may not have a base salary
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAnnualSalary() {
        return hoursWorked * hourlyRate * 12;  // Calculate based on monthly hours worked
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hours Worked per Month: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}