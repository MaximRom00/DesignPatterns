package patterns.structural.flyweight.model;

public class Developer implements Employee{

    private String name;
    private double salary;


    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void getPersonInfo() {
        System.out.println(name + ", salary: " + salary + ", skill: " + Skill.DEVELOPER.getName());
    }

    @Override
    public String workResponsibilities() {
        return Skill.DEVELOPER.getName() + ", salary: " + salary;
    }
}
