package com.pb.zacharov.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        int n = 3;
        Animal[] animals = new Animal[n];
        animals[0]=new Cat(" Вася "," рыбу "," диване "," ноги ");
        animals[1]= new Dog(" Мухтар "," мясо ", " будка "," кость ");
        animals[2]= new Horse(" Быстрый "," сено "," поле "," вокруг леса ");

        Object obj = Class.forName("com.pb.zacharov.hw6.Veterinarian").getConstructor(new Class[]{}).newInstance();

        if(obj instanceof Veterinarian){
            for(Animal animal: animals){
                ((Veterinarian)obj).treatAnimal(animal);
                System.out.println("-------------------------------------------------");
            }
        }

    }
}
