package patterns.creational.factory.model;

public class PhpDeveloper implements Developer{
    @Override
    public void getDeveloperDetail() {
        System.out.println("I'm a php developer.");
    }
}
