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
    /*
     * Реализовать коллекцию SimpleSet.
     * Коллекция должна обеспечивать void add(E e) и реализовывать Iterator<E>.
     * Коллекция не должна хранить дубликаты.
     * Set - внутри для хранения данных использует связный список.
     */
    public void add(E e) {
        for (E e1 : value) {
            value = (Set<E>) e1;
        }
    }

    @Override
    public boolean hasNext() {
        return value.size() > size;
    }

    @Override
    public E next() {
        for (E e : value) {
            value.add(e);
        }
        return (E) value;
    }
}
