package patterns.creational.factory;

import patterns.creational.factory.model.*;

public class DeveloperFactory {

    protected Developer getDeveloper(DeveloperType type){

        if (type == DeveloperType.JAVA) {
            return new JavaDeveloper();
        } else if (type == DeveloperType.PHP) {
            return new PhpDeveloper();
        } else if (type == DeveloperType.SCALA) {
            return new ScalaDeveloper();
        } else {
            throw new IllegalArgumentException("Can't return developer, unknown developerType: " + type);
        }
    }
}