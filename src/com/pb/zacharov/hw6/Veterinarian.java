package com.pb.zacharov.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(animal.getName()+"ест"+animal.getFood()+
                " и находится "+ animal.getLocation());
    }
}
