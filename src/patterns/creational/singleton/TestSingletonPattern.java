package patterns.creational.singleton;

public class TestSingletonPattern {
    public static void main(String[] args) {
        Developer developer = Developer.getInstance("Java");
        System.out.println(developer);
    }
}
