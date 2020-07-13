package com.igeek.ch07.trans.exception;

public class AccountException extends  Exception {

    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }
}