package patterns.structural.bridge.car;

import patterns.structural.bridge.color.Color;

public class AudiCar extends Car{

    public AudiCar(Color color) {
        super(color);
    }

    @Override
    public String drive() {
        return "This is audi car with " + color.getColor();
    }


}
