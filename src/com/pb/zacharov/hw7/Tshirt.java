package com.pb.zacharov.hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes{

    public Tshirt(String name, Size size, int cost, String color) {
        super(name, size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println(getName() + " есть " + getSize().getDescription() +
                ": " + getSize() + " (" + getSize().getEuroSize() + "), цену: "
                + getCost() + " и цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println(getName() + " есть " + getSize().getDescription() +
                ": " + getSize() + " (" + getSize().getEuroSize() + "), цену: "
                + getCost() + " и цвет: " + getColor());
    }
}
