package patterns.creational.factory;

import patterns.creational.factory.model.Developer;
import patterns.creational.factory.model.DeveloperType;

public class TestFactoryPattern {

    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        Developer firstDeveloper = factory.getDeveloper(DeveloperType.JAVA);
        firstDeveloper.getDeveloperDetail();

        Developer secondDeveloper = factory.getDeveloper(DeveloperType.PHP);
        secondDeveloper.getDeveloperDetail();
    }
}
