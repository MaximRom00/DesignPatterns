package patterns.creational.abstractfactory.model.closet;

public class WardrobeCloset implements Closet{
    @Override
    public void typeOfCloset() {
        System.out.println("It's wardrobe closet.");
    }
}
