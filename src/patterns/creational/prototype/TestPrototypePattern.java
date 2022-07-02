package patterns.creational.prototype;

public class TestPrototypePattern {
    public static void main(String[] args) {

        Developer developer = new Developer("Developer", 1000, new Person("Ivan", "Ivanov"));

        Developer javaDeveloper = (Developer) developer.createClone();
        Developer phpDeveloper = (Developer) developer.createClone();
        Developer jsDeveloper = (Developer) developer.createClone();

        javaDeveloper.setName("java");
        phpDeveloper.setName("php");
        jsDeveloper.setName("js");

        System.out.println(developer);
        System.out.println(javaDeveloper);
        System.out.println(phpDeveloper);
        System.out.println(jsDeveloper);
    }
}
