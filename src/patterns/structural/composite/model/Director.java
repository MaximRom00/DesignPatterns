package patterns.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Director implements Employee{

    private String name;
    private double salary;
    private List<Employee> employees;

    public Director(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + ", salary: " + salary);
        System.out.println("All employees:");
        employees.forEach(Employee::showEmployeeDetails);
    }
}
