package patterns.structural.composite.model;

public class Developer implements Employee{

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + ", salary: " + salary);
    }
}
