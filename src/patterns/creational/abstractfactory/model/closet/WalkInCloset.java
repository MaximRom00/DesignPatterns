package patterns.creational.abstractfactory.model.closet;

public class WalkInCloset implements Closet{
    @Override
    public void typeOfCloset() {
        System.out.println("It's walk in closet.");
    }
}
