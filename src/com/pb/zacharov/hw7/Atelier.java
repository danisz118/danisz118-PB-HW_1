package com.pb.zacharov.hw7;

import java.util.Random;

public class Atelier {
    static void dressMan(Clothes[] clothes){
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }



    public static void main(String[] args) {
        int n = 10;
        Clothes[] clothes = new Clothes[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Size size = null;
            switch (random.nextInt(5)) {
                case 0: {
                    size = Size.XXS;
                    break;
                }
                case 1: {
                    size = Size.XS;
                    break;
                }
                case 2: {
                    size = Size.S;
                    break;
                }
                case 3: {
                    size = Size.M;
                    break;
                }
                case 4: {
                    size = Size.L;
                    break;
                }
            }
            String color = null;
            switch (random.nextInt(3)) {
                case 0: {
                    color = "Красный";
                    break;
                }
                case 1: {
                    color = "Зелёный";
                    break;
                }
                case 2: {
                    color = "Синий";
                    break;
                }
            }
            switch (random.nextInt(4)) {
                case 0: {
                    clothes[i] = new Tshirt("Футболка", size, 200, color);
                    break;
                }
                case 1: {
                    clothes[i] = new Pants("Штаны", size, 250, color);
                    break;
                }
                case 2: {
                    clothes[i] = new Skirt("Юбка", size, 300, color);
                    break;
                }
                case 3: {
                    clothes[i] = new Tie("Галстук", size, 150, color);
                    break;
                }
            }
        }
        System.out.println("Мужская одежда:");
        dressMan(clothes);
        System.out.println("\n Женская:");
        dressWomen(clothes);
    }
}
