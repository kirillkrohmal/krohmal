package ru.job4j.BankATM;

/**
 * Created by Comp on 12.09.2017.
 */
public enum Operation {
    INFO,
    LOGIN,
    DEPOSIT,
    WITHDRAW,
    EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i) {
        if (i == 0) {
            return Operation.LOGIN;
        } else if (i == 1) {
            return Operation.INFO;
        } else if (i == 2) {
            return Operation.DEPOSIT;
        } else if (i == 3) {
            return Operation.WITHDRAW;
        } else if (i == 4) {
            return Operation.EXIT;
        } else throw new IllegalArgumentException();
    }
}
