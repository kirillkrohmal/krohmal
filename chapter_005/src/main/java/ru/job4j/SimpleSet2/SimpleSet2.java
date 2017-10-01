package ru.job4j.SimpleSet2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Comp on 25.09.2017.
 */
public class SimpleSet2<E> implements Iterator<E> {
    Set<E> value = new LinkedHashSet<>();
    int size = 0;

    public void add(E e) {
        value.add(e);
    }

    @Override
    public E next() {
        for (E e : value) {
            value.add(e);
        }

        return (E) value;
    }

    @Override
    public boolean hasNext() {
        return value.size() > size;
    }
}
