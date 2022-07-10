package patterns.structural.decorator.decorator;

import patterns.structural.decorator.model.Computer;

public class WorkComputer extends ComputerDecorator {

    public WorkComputer(Computer computer) {
        super(computer);
    }

    @Override
    public String getComputerInfo() {
        return super.getComputerInfo() + getWorkComputerInfo();
    }

    public String getWorkComputerInfo(){
        return " with 16GB Ram";
    }
}
