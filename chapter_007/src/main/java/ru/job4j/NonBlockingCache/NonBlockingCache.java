package ru.job4j.NonBlockingCache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Comp on 23.11.2017.
 */
public class NonBlockingCache extends OptimisticException {
    ConcurrentHashMap<Integer, Base> concurrentHashMap;

    public NonBlockingCache(String msg) {
        super(msg);
    }

    public void add (Base model) throws OptimisticException {

    }

    public void update (Base model) throws OptimisticException {

    }

    public void delete (Base model) throws OptimisticException {

    }
}
