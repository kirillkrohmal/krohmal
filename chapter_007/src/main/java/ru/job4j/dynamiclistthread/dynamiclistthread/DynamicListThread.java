package ru.job4j.dynamiclistthread.dynamiclistthread;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Comp on 03.10.2017.
 */
@ThreadSafe
public class DynamicListThread<E> implements Iterable<E> {
    @GuardedBy("this")
    private E[] container = (E[]) new Object[1000];
    @GuardedBy("this")
    private int size;

    public synchronized void add(E value) {
        if (container.length > size) {
            container[size++] = value;
        } else if (container.length == size) {
            container = Arrays.copyOf(container, container.length * 2);
        }
    }

    public synchronized E get(int index) {
        E s = (E) new Object();
        if (index >= 0 && index < size) {
            s = container[index];
        }
        return s;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator<E> {
        int count = 0;

        @Override
        public synchronized boolean hasNext() {
            boolean isPresent = false;

            if (count < size) {
                isPresent = true;
            }
            return isPresent;
        }

        @Override
        public synchronized E next() {
            Object index = null;
            if (hasNext()) {
                index = container[count++];
            }
            return (E) index;
        }
    }
}
