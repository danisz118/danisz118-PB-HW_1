package com.pb.zacharov.hw9;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        FileNumbers fileNumbers = new FileNumbers();
        String patchFile;
        int[][] ArrayInt = new int[10][10];
        Random RandomInt = new Random();

        System.out.println("Создали массив");
        for (int i = 0; i < ArrayInt.length; i++) {
            for (int j = 0; j < ArrayInt[i].length; j++) {
                ArrayInt[i][j] = RandomInt.nextInt(100);
                System.out.print(ArrayInt[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");
        patchFile = "c:\\\\numbers.txt";
        System.out.println("Запишем массив в файл - " + patchFile);
        fileNumbers.createNumbersFile(patchFile, ArrayInt);
        System.out.println("-------------------------------------------");
        System.out.println("Прочитаем файл " + patchFile + " заменим четные на  0");
        fileNumbers.createOddNumbersFile(patchFile, "Y");
        System.out.println("-------------------------------------------");
        System.out.println("Прочитаем новый файл  c:\\\\odd-numbers.txt");
        fileNumbers.createOddNumbersFile("c:\\\\odd-numbers.txt", "N");

    }
}
