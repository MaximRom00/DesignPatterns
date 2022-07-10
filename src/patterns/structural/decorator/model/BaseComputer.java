package patterns.structural.decorator.model;

public class BaseComputer implements Computer {
    @Override
    public String getComputerInfo() {
        return "Base computer";
    }
}
