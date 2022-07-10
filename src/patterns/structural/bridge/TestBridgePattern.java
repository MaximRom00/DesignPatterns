package patterns.structural.bridge;

import patterns.structural.bridge.car.AudiCar;
import patterns.structural.bridge.car.Car;
import patterns.structural.bridge.car.MercedesCar;
import patterns.structural.bridge.color.BlackColor;
import patterns.structural.bridge.color.RedColor;

public class TestBridgePattern {
    public static void main(String[] args) {

        Car firstCar = new AudiCar(new BlackColor());
        Car secondCar = new MercedesCar(new RedColor());

        System.out.println(firstCar.drive());
        System.out.println(secondCar.drive());
    }
}
