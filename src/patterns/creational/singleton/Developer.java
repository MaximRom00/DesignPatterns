package patterns.creational.singleton;

public class Developer {

    private static Developer instance;
    private String name;

    private Developer(String name){
        this.name = name;
    }

    public static Developer getInstance(String name){
        if (instance == null){
            instance = new Developer(name);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                '}';
    }
}
