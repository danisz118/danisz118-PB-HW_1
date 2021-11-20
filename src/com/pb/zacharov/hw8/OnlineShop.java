package com.pb.zacharov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Auth auth = new Auth();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи логин: ");
        String login = scanner.nextLine();
        System.out.print("Введи пароль : ");
        String password = scanner.nextLine();
        System.out.print("Повтори пароль: ");
        String confirmPassword = scanner.nextLine();
        auth.signUp(login, password, confirmPassword);
        System.out.println("Нового пользователя создано успешно \nАвторизация");
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();
        auth.signIn(login, password);
        System.out.println("Поздравляю  " + login + " в системе!");
        scanner.close();
    }
}
