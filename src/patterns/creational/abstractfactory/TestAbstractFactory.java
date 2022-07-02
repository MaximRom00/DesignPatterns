package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.factory.FirstDesignFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {

        FirstDesignFactory firstDesign = new FirstDesignFactory();

        firstDesign.createTable().tableColour();
        firstDesign.createCloset().typeOfCloset();
        firstDesign.createSofa().typeOfSofa();
    }
}
