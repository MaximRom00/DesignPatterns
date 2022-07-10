package patterns.structural.flyweight.model;

public class Tester implements Employee{
    private String name;
    private double salary;

    public Tester(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void getPersonInfo() {
        System.out.println(name + ", salary: " + salary + ", skill: " + Skill.TESTER.getName());
    }

    @Override
    public String workResponsibilities() {
        return Skill.TESTER.getName() + ", salary: " + salary;
    }
}
