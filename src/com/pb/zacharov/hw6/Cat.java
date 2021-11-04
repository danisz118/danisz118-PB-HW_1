package com.pb.zacharov.hw6;

import java.util.Objects;

public class Cat extends Animal{
    String favoriteLocation;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String food, String location, String favoriteLocation){
        super(name, food, location);
        this.favoriteLocation = favoriteLocation;
    }


    @Override
    public void makeNoise() {
        System.out.println(" Кот мяукает , мяу.. ");
    }

    @Override
    public void eat() {
        System.out.println(" Кот ест рыбу ");
    }

    public String getFavoriteLocation() {
        return favoriteLocation;
    }

    public void setFavoriteLocation(String favoriteLocation) {
        this.favoriteLocation = favoriteLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(getFavoriteLocation(), cat.getFavoriteLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFavoriteLocation());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", favoriteLocation='" + favoriteLocation + '\'' +
                '}';
    }
}
