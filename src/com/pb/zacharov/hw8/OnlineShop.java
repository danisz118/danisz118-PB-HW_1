package com.pb.zacharov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args){
        Auth auth = new Auth();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи логин: ");
        String login = scanner.nextLine();
        System.out.print("Введи пароль : ");
        String password = scanner.nextLine();
        System.out.print("Повтори пароль: ");
        String confirmPassword = scanner.nextLine();
        try {
            auth.signUp(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            System.out.println("Пробуй еще раз ");
        }
        System.out.println("Нового пользователя создано успешно \nАвторизация");
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();
        try {
            auth.signIn(login, password);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            System.out.println("Пробуй еще раз ");
        }
        System.out.println("Поздравляю  " + login + " в системе!");
        scanner.close();
    }
}
