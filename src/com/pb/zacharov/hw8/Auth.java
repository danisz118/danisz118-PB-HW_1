package com.pb.zacharov.hw8;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        setLogin(login);
        setPassword(password, confirmPassword);
    }

    public void signIn(String login, String password) throws WrongLoginException, WrongPasswordException {
        if(!(login.equals(getLogin()) && password.equals(getPassword(login)))){
            throw new WrongPasswordException("Логин или пароль не совпадают.");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws WrongLoginException {
        if(!Pattern.compile("[a-zA-Z0-9]{5,20}").matcher(login).find()){
            throw new WrongLoginException("Логин не отвечает условиям .");
        }
        this.login = login;
    }

    public String getPassword(String login) throws WrongLoginException {
        if(login.equals(this.login)){
            return password;
        }else{

            throw new WrongLoginException("Этот пользователь, " + login + ", не может получить пароль.");
        }
    }

    public void setPassword(String password, String confirm) throws WrongPasswordException {
        if(!password.equals(confirm)){
            throw new WrongPasswordException("Пароли не совпадают.");
        }
        if(!Pattern.compile("[a-zA-Z0-9_]{5,}").matcher(password).find()){
            throw new WrongPasswordException("Пароль не отвечает условиям .");
        }
        this.password = password;
    }
}
