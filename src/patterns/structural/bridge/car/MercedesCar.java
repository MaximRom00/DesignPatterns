package patterns.structural.bridge.car;

import patterns.structural.bridge.color.Color;

public class MercedesCar extends Car {

    public MercedesCar(Color color) {
        super(color);
    }

    @Override
    public String drive() {
        return "This is mercedes car with " + color.getColor();
    }
}
