package patterns.structural.flyweight;

import patterns.structural.flyweight.model.*;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static Map<Skill, Employee> employeeMap = new HashMap<>();

    public Employee getEmployee(Skill skill, String name, double salary){
        Employee employee = null;
        if(employeeMap.get(skill) != null){
            employee = employeeMap.get(skill);
        }
        else{
            switch (skill){
                case DEVELOPER:
                    System.out.println("Developer created!");
                    employee = new Developer(name, salary);
                    break;
                case TESTER:
                    System.out.println("Tester created!");
                    employee = new Tester(name, salary);
                    break;
                case MANAGER:
                    System.out.println("Manger created!");
                    employee = new Manager(name, salary);
                    break;
                default:
                    System.out.println("No such Employee!");
            }
            employeeMap.put(skill, employee);
        }
        return employee;
    }
}
