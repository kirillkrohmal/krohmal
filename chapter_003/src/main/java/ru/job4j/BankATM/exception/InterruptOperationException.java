package ru.job4j.BankATM.exception;

/**
 * Created by Comp on 12.09.2017.
 */
public class InterruptOperationException extends RuntimeException {
    public InterruptOperationException(String message) {
        super(message);
    }
}
