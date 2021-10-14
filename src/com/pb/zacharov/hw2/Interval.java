package com.pb.zacharov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число для определения попадания в определенный онтервал  от 0-100");
        int digit = scanner.nextInt();

        if (digit >= 0 && digit <= 14) {
            System.out.println("Попал в интервал [0-14]");
        } else if (digit >= 15 && digit <= 35) {
            System.out.println("Попал в интервал [15 - 35]");
        } else if (digit >= 36 && digit <= 50) {
            System.out.println("Попал в интервал [36 - 50]");
        } else if (digit >= 51 && digit <= 100) {
            System.out.println("Попал в интервал [51 - 100]");
        } else {
            System.out.println("Не попал в доступный интервал!!");
        }

    }
}
