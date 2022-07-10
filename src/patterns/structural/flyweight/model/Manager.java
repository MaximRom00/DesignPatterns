package patterns.structural.flyweight.model;

public class Manager implements Employee{
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void getPersonInfo() {
        System.out.println(name + ", salary: " + salary + ", skill: " + Skill.MANAGER.getName());
    }

    @Override
    public String workResponsibilities() {
        return Skill.MANAGER.getName() + ", salary: " + salary;
    }
}
