package ru.job4j.nonblockingcache;

/**
 * Created by Comp on 27.07.2018.
 */
public class OptimisticException extends RuntimeException {
    public OptimisticException(String msg) {
        super(msg);
    }
}
