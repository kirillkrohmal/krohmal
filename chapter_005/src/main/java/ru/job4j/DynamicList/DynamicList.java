package ru.job4j.DynamicList;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Comp on 03.10.2017.
 */
public class DynamicList<E> implements Iterable<E> {
    E[] container = (E[]) new Object[1000];
    int size = 0;

    public void add(E value) {
        if (container.length > size) {
            container[size++] = value;
        } else if (container.length == size) {
            container = Arrays.copyOf(container, container.length * 2);
        }
    }

    public E get(int index) {
        E element = (E) new Object();
        if (index >= 0 && index < size) {
            element = container[index];
        }
        return element;
    }

    class ArrayIterator implements Iterator<E> {
        int count = 0;

        @Override
        public boolean hasNext() {
            boolean isPresent = false;

            if (count < size) {
                isPresent = true;
            }
            return isPresent;
        }

        @Override
        public E next() {
            Object index = null;
            if (hasNext() == true) {
                index = container[count++];
            }
            return (E) index;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }
}
