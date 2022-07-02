package patterns.creational.abstractfactory.model.table;

public class WhiteTable implements Table{
    @Override
    public void tableColour() {
        System.out.println("It's white table.");
    }
}
