package com.pb.zacharov.hw8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String text) {
        super(text);
    }
}
