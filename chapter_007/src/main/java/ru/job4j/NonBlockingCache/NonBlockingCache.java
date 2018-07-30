package ru.job4j.NonBlockingCache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Comp on 23.11.2017.
 */
public class NonBlockingCache extends OptimisticException {
    ConcurrentHashMap<Integer, Base> concurrentHashMap;
    Base base = new Base();

    public NonBlockingCache(String msg) {
        super(msg);
    }

    public void add (Base model) {
        //concurrentHashMap.computeIfPresent();


    }

    public void update (Base model) {

    }

    public void delete (Base model) {

    }
}
