package com.pb.zacharov.hw8;

public class WrongLoginException extends  Exception {
    public WrongLoginException() {
        super();
    }
    public WrongLoginException(String text) {
        super(text);
    }

}
