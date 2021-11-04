package com.pb.zacharov.hw6;

import java.util.Objects;

public class Horse extends Animal {
    String favoriteWay;


    public Horse(String name) {
        super(name);
    }

    public Horse(String name, String food, String location, String favoriteWay) {
        super(name, food, location);
        this.favoriteWay = favoriteWay;
    }

    public String getFavoriteWay() {
        return favoriteWay;
    }

    public void setFavoriteWay(String favoriteWay) {
        this.favoriteWay = favoriteWay;
    }

    @Override
    public void makeNoise() {
        System.out.println("Игого");
    }

    @Override
    public void eat() {
        System.out.println("Сено");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(getFavoriteWay(), horse.getFavoriteWay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFavoriteWay());
    }

    @Override
    public String toString() {
        return "[" + super.toString() +
                ", Любимое место : " + favoriteWay + "]";
    }
}
