package ru.job4j.DynamicList;

import java.util.Iterator;

public class DynamicList<E> implements Iterable<E> {
    Object[] container;
    int size = 0;

    public void add(E value) {
        container[size++] = value;
    }

    public E get(int index) {
        return (E) container[index];
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) container[size++];
    }
}
