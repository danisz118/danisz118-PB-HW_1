package com.pb.zacharov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bingoDigit = random.nextInt(101);
        int counter = 0;
        System.out.println("Введи число чтоб его отгадать, для выхода введи 300 ");
        while (true) {
            int userDigit = scanner.nextInt();
            counter++;
            if (userDigit == 300) {
                System.out.println("Игра окончена");
                break;
            }
             else if (userDigit == bingoDigit) {
                System.out.println("Число отгадано, заняло это " + counter + " попыток");
                break;
            } else if (userDigit > bingoDigit) {
                System.out.println("Введенное чило больше загаданного , попробуй еще раз :)");
            } else if (userDigit < bingoDigit) {
                System.out.println("Введенное чило меньше загаданного , попробуй еще раз :)");
            }

        }
    }
}
