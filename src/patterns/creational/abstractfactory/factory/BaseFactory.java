package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.model.closet.Closet;
import patterns.creational.abstractfactory.model.sofa.Sofa;
import patterns.creational.abstractfactory.model.table.Table;

public interface BaseFactory {

    Table createTable();

    Closet createCloset();

    Sofa createSofa();
}
