package qsn3;

import java.util.*;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{id="+id+",name="+name+",salary="+salary+"}";
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 75000.0),
                new Employee(105, "Bob", 82000.0),
                new Employee(102, "Charlie", 75000.0),
                new Employee(103, "Diana", 90000.0),
                new Employee(104, "Eve", 75000.0)
        );
        employees.sort(Comparator.comparingInt(Employee::getId));
        employees.forEach(System.out::println);
    }
}

