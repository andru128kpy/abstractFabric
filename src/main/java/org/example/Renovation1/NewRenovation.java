package org.example.Renovation1;

import org.example.Chair;
import org.example.FabricFurniture;
import org.example.Renovation1.Armchair;
import org.example.Renovation1.CheckRoom;
import org.example.Renovation1.DiningTable;
import org.example.Table;
import org.example.Wardrobe;

public class NewRenovation implements FabricFurniture {
    @Override
    public Wardrobe createWardrobe() {
        return new CheckRoom();
    }

    @Override
    public Chair createChair() {
        return new Armchair();
    }

    @Override
    public Table createTable() {
        return new DiningTable();
    }
}
