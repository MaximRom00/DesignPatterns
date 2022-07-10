package patterns.structural.bridge.car;

import patterns.structural.bridge.color.Color;

public abstract class Car {
    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    abstract public String drive();
}
