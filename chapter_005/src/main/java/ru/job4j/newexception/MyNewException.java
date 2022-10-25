package ru.job4j.newexception;

import java.io.IOException;

public class MyNewException extends RuntimeException {
    public MyNewException(String message) {
        super(message);
    }

    public MyNewException() {
    }
}
