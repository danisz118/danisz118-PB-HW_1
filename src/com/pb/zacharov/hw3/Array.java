package com.pb.zacharov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
      //  Random random = new Random();
        System.out.println("Введи числа массива ");
        Scanner scanner = new Scanner(System.in);
        int sumCounter = 0;
        int countDigitMoreZero = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Массив отсортированый от меньшего к большему ");
        for (int arrays : array) {
            sumCounter += arrays;
            System.out.print(arrays + " ");

            if (arrays >= 0) {
                countDigitMoreZero++;
            }
        }
        System.out.println();
        System.out.println("Сумма элементов массива равна = " + sumCounter);
        System.out.println("Количество позитивных чисел " + countDigitMoreZero);
    }
}
