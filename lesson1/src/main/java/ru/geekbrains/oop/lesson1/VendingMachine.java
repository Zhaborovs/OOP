package ru.geekbrains.oop.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }
    public Chokolate getChokolate(String name, double volume){
        for (Product product : products){
            if (product instanceof Chokolate){
                Chokolate chokolate = (Chokolate)product;
                if (chokolate.getName().equals(name) && chokolate.getKkal() == volume)
                    return chokolate;
            }
        }
        return null;
    }


}
