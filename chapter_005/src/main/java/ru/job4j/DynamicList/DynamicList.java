package ru.job4j.DynamicList;

import java.util.ArrayList;
import java.util.Iterator;

public class DynamicList<E> implements Iterable<E> {

    Object[] container;
    ArrayList list;
    int size = 0;

    public void add(E value) {
        //list.add(value);
        container[size++] = value;
    }

    public E get(int index) {
        return (E) container[index];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
