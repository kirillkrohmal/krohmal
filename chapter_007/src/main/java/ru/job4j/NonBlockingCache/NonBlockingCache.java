package ru.job4j.NonBlockingCache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Comp on 23.11.2017.
 */
public class NonBlockingCache extends OptimisticException {
    ConcurrentHashMap<Integer, Base> concurrentHashMap;
    Base base = new Base();

    int key = 100;
    public NonBlockingCache(String msg) {
        super(msg);
    }

    public void add (Base model) {
        for (int i = 0; i < key; i++) {
            concurrentHashMap.put(key, model);
        }
    }

    public void update (Base model) {
        for (int i = 0; i < key; i++) {
            concurrentHashMap.replace(key, model);
        }
    }

    public void delete (Base model) {
        for (int i = 0; i < key; i++) {
            concurrentHashMap.remove(key, model);
        }
    }
}
