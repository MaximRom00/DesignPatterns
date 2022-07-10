package patterns.structural.flyweight;

import patterns.structural.flyweight.model.Employee;
import patterns.structural.flyweight.model.Skill;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweightPattern {
    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactory();

        List<Employee> employees = new ArrayList<>();

        employees.add(employeeFactory.getEmployee(Skill.DEVELOPER, "Ivan", 1000));
        employees.add(employeeFactory.getEmployee(Skill.DEVELOPER, "Max", 1500));
        employees.add(employeeFactory.getEmployee(Skill.MANAGER, "Anna", 950));
        employees.add(employeeFactory.getEmployee(Skill.TESTER, "Olga", 1250));

        employees.forEach(Employee::getPersonInfo);
    }
}
