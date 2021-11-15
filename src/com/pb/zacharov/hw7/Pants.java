package com.pb.zacharov.hw7;

public class Pants extends Clothes implements WomenClothes,ManClothes{

    public Pants(String name, Size size, int cost, String color) {
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
