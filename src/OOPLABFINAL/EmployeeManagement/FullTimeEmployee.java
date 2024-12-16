package OOPLABFINAL.EmployeeManagement;

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary() {
        return (baseSalary * 12) + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Annual Salary (with Bonus): " + calculateAnnualSalary());
    }
}

