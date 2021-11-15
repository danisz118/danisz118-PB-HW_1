package com.pb.zacharov.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(String name, Size size, int cost, String color) {
        super(name, size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println(getName() + " есть " + getSize().getDescription() +
                ": " + getSize() + " (" + getSize().getEuroSize() + "), цену: "
                + getCost() + " и цвет: " + getColor());
    }
}
