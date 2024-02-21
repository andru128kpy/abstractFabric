package org.example.Renovatio2;

import org.example.Chair;
import org.example.FabricFurniture;
import org.example.Table;
import org.example.Wardrobe;

public class NewRenovation2 implements FabricFurniture {
    @Override
    public Wardrobe createWardrobe() {
        return new CheckRoom2();
    }

    @Override
    public Chair createChair() {
        return new Armchair2();
    }

    @Override
    public Table createTable() {
        return new DiningTable2();
    }
}
