package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.model.closet.Closet;
import patterns.creational.abstractfactory.model.closet.LinenCloset;
import patterns.creational.abstractfactory.model.sofa.LTypeSofa;
import patterns.creational.abstractfactory.model.sofa.Sofa;
import patterns.creational.abstractfactory.model.table.Table;
import patterns.creational.abstractfactory.model.table.WhiteTable;

public class SecondFactoryDesign implements BaseFactory{
    @Override
    public Table createTable() {
        return new WhiteTable();
    }

    @Override
    public Closet createCloset() {
        return new LinenCloset();
    }

    @Override
    public Sofa createSofa() {
        return new LTypeSofa();
    }
}
