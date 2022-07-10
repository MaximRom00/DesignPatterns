package patterns.structural.flyweight.model;

public enum Skill {

    DEVELOPER("Product development"),
    MANAGER("Job management"),
    TESTER("Error testing");

    private String name;

    Skill(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
