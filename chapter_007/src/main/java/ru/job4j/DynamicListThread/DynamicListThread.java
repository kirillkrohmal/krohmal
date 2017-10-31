package ru.job4j.DynamicListThread;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Comp on 03.10.2017.
 */
public class DynamicListThread<E> implements Runnable {
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
        E s = (E) new Object();
        if (index >= 0 && index < size) {
            s = container[index];
        }
        return s;
    }

    @Override
    public void run() {

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
}
