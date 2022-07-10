package patterns.structural.decorator;

import patterns.structural.decorator.model.BaseComputer;
import patterns.structural.decorator.model.Computer;
import patterns.structural.decorator.decorator.GameComputer;
import patterns.structural.decorator.decorator.WorkComputer;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        Computer gameComputer = new GameComputer(new BaseComputer());

        System.out.println(gameComputer.getComputerInfo());

        Computer workComputer = new WorkComputer(new BaseComputer());

        System.out.println(workComputer.getComputerInfo());
    }
}
