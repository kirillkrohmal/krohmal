package ru.job4j.TestTask.Exception;

/**
 * Created by Comp on 03.07.2017.
 */
public class ImpossibleMoveException extends RuntimeException {
    ImpossibleMoveException(String msg) {
        super(msg);
    }
}
