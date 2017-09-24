package ru.job4j.SimpleSet;

import java.util.Iterator;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleSet<E> implements Iterator<E> {
    int[] value = {};
    void add(E e) {
        for(int i = 0; i < value.length; i++) {
            //int num = Integer.parseInt(i);
            //value.add(num);
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
