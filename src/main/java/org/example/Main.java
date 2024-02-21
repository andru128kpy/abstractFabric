package org.example;

import org.example.Renovatio2.NewRenovation2;
import org.example.Renovation1.NewRenovation;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FabricFurniture renovation1 = createRenovation(1);
        Chair chair = renovation1.createChair();
        Table table = renovation1.createTable();
        Wardrobe wardrobe = renovation1.createWardrobe();
        chair.paintChair();
        table.paintTable();
        wardrobe.paintWardrobe();

        FabricFurniture renovation2 = createRenovation(2);
        Chair chair2 = renovation2.createChair();
        Table table2 = renovation2.createTable();
        Wardrobe wardrobe2 = renovation2.createWardrobe();

        chair2.paintChair();
        table2.paintTable();
        wardrobe2.paintWardrobe();
    }

    static FabricFurniture createRenovation(int number){
        return switch (number){
          case 1 -> new NewRenovation();
          case 2 -> new NewRenovation2();
            default -> throw new IllegalArgumentException("Некорректный ввод");
        };
    }
}