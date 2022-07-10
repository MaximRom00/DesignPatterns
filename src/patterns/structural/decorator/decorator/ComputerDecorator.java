package patterns.structural.decorator.decorator;

import patterns.structural.decorator.model.Computer;

public class ComputerDecorator implements Computer {

    private Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getComputerInfo() {
        return computer.getComputerInfo();
    }
}
