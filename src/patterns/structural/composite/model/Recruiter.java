package patterns.structural.composite.model;

public class Recruiter implements Employee{

    private String name;
    private double salary;

    public Recruiter(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + ", salary: " + salary);
    }
}
