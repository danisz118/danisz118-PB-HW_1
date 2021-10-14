package com.pb.zacharov.hw2;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести две переменные для арифметических операций");
        int operand1 = scanner.nextInt();
        System.out.println("Вторая переменная");
        int operand2 = scanner.nextInt();
        System.out.println("Введи знак арифметической операции ");
        char sign = scanner.next().charAt(0);
        double result = 0;
        switch (sign) {
            case '+':
                System.out.println("Результат операции " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат операции " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат операции " + operand1 * operand2);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Деление на ноль !!  ");
                    break;
                } else
                    System.out.println("Результат операции " + operand1 / operand2);
                break;
            default:
                System.out.println("Не верный оператор!!");
                return;
        }
    }

}
