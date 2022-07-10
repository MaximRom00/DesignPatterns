package patterns.structural.facade;

import patterns.structural.facade.model.Car;

public class TestFacadePattern {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
