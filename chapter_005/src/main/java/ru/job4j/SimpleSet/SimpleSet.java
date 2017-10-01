package ru.job4j.SimpleSet;

import java.util.Iterator;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleSet<E> implements Iterator<E> {
    Object[] value;
    int size;

    public void add(E e) {
        value[size] = e;
    }

    @Override
    public E next() {
        return (E) value[size++];
    }

    @Override
    public boolean hasNext() {
        return value.length > size;
    }
}
