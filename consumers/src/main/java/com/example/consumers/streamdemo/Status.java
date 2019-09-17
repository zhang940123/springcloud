package com.example.consumers.streamdemo;

public enum Status {
    CONTINUE(100),
    STATUSCONTINUE(100);

    private int code;

    Status(int code) {
        this.code = code;
    }
}


