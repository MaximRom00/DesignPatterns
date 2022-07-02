package patterns.creational.prototype;

public class Developer implements Prototype{

    private String name;
    private double salary;
    private Person person;

    public Developer(String name, double salary, Person person) {
        this.name = name;
        this.salary = salary;
        this.person = person;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public Prototype createClone() {
        return new Developer(name, salary, (Person) person.createClone());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", person=" + person +
                '}';
    }
}
