package patterns.structural.composite;

import patterns.structural.composite.model.Developer;
import patterns.structural.composite.model.Director;
import patterns.structural.composite.model.Recruiter;

import java.util.stream.Stream;

public class TestCompositePattern {
    public static void main(String[] args) {

        Developer javaDeveloper = new Developer("Ivan",1250);
        Developer phpDeveloper = new Developer("Anton",2500);
        Developer jsDeveloper = new Developer("Maxim",750);

        Recruiter firstRecruiter = new Recruiter("Anna", 950);
        Recruiter secondRecruiter = new Recruiter("Oleg", 900);
        Recruiter thirdRecruiter = new Recruiter("Dmitry", 1350);

        Director director = new Director("Alexander", 3500);

        Stream.of(javaDeveloper, phpDeveloper, jsDeveloper).forEach(director::addEmployee);
        Stream.of(firstRecruiter, secondRecruiter, thirdRecruiter).forEach(director::addEmployee);

        director.showEmployeeDetails();

        Stream.of(javaDeveloper).forEach(director::removeEmployee);
        Stream.of(firstRecruiter).forEach(director::removeEmployee);

        director.showEmployeeDetails();
    }
}
