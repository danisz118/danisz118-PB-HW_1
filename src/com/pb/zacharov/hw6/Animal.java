package com.pb.zacharov.hw6;

import java.util.Objects;

public class Animal {
    protected String food;
    protected String location;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String food){
        this(name);
        this.food = food;
    }

    public Animal(String name, String food, String location){
        this(name, food);
        this.location = location;
    }


    public void makeNoise(){
        System.out.println(name+ " Голос ");
    }

    public void eat(){
        System.out.println(name+ " Кушать в "+ location);
    }

    public void sleep(){
        System.out.println(" Спать "+location);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getFood(), animal.getFood()) && Objects.equals(getLocation(), animal.getLocation()) && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFood(), getLocation(), getName());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

