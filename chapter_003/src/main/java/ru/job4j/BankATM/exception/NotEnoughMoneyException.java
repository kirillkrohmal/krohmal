package ru.job4j.BankATM.exception;

/**
 * Created by Comp on 12.09.2017.
 */
public class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
