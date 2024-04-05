package ru.geekbrains.oop.lesson1;

public class Chokolate extends Product {

    private double Kkal;

    public double getKkal() {
        return Kkal;
    }

    public void setKkal(double volume) {
        this.Kkal = volume;
    }


    public Chokolate(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.Kkal = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколадка\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалорийность: %.0f]",
                brand, name, price, Kkal);
    }

}
