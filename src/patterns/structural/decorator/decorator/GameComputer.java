package patterns.structural.decorator.decorator;

import patterns.structural.decorator.model.Computer;

public class GameComputer extends ComputerDecorator {

    public GameComputer(Computer computer) {
        super(computer);
    }

    @Override
    public String getComputerInfo() {
        return super.getComputerInfo() + getGameComputerInfo();
    }

    public String getGameComputerInfo(){
        return " with 32GB Ram, GeForce RTX 3090";
    }
}
