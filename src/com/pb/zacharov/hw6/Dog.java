package com.pb.zacharov.hw6;

import java.util.Objects;

public class Dog extends Animal {
    String favoriteToy;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String food, String location, String favoriteToy) {
        super(name, food, location);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void makeNoise() {
        System.out.println(" Собака гавкает ");
    }

    @Override
    public void eat() {
        System.out.println("  Собака ест кашу ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getFavoriteToy(), dog.getFavoriteToy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFavoriteToy());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", favoriteToy='" + favoriteToy + '\'' +
                '}';
    }
}
