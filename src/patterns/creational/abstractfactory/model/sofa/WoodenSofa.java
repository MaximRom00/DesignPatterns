package patterns.creational.abstractfactory.model.sofa;

public class WoodenSofa implements Sofa{
    @Override
    public void typeOfSofa() {
        System.out.println("It's wooden sofa.");
    }
}
