package patterns.creational.abstractfactory.model.table;

public class BlackTable implements Table{
    @Override
    public void tableColour() {
        System.out.println("It's black table.");
    }
}
