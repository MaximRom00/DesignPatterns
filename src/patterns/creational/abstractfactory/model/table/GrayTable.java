package patterns.creational.abstractfactory.model.table;

public class GrayTable implements Table{
    @Override
    public void tableColour() {
        System.out.println("It's gray table.");
    }
}
