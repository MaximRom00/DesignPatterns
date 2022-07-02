package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.model.closet.Closet;
import patterns.creational.abstractfactory.model.closet.WardrobeCloset;
import patterns.creational.abstractfactory.model.sofa.Sofa;
import patterns.creational.abstractfactory.model.sofa.WoodenSofa;
import patterns.creational.abstractfactory.model.table.GrayTable;
import patterns.creational.abstractfactory.model.table.Table;

public class FirstDesignFactory implements BaseFactory{
    @Override
    public Table createTable() {
        return new GrayTable();
    }

    @Override
    public Closet createCloset() {
        return new WardrobeCloset();
    }

    @Override
    public Sofa createSofa() {
        return new WoodenSofa();
    }
}
