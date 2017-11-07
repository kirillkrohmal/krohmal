package ru.job4j.SimpleSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleSet<E> implements Iterator<E> {
    Object[] value;
    int size = 0;
    E e = null;

    public SimpleSet() {
        this.value = new Object[1000];
    }

    public SimpleSet(Object[] value, int size) {
        this.value = value;
        this.size = size;
    }


    public void add(E e) {
        boolean isPresent = false;

        for (int i = 0; i < size; i++) {
            if (value[i].equals(e)) {
                isPresent = true;
            }
        }
        if (!isPresent) {
            if (size < value.length) {
                value[size++] = e;
            }
        }
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;

        if (value.length > size) {
            isPresent = true;
        }
        return isPresent;
    }


    @Override
    public E next() {
        Object[] elem = (E[]) value[size];
        if (hasNext() == true) {
            for (int i = 0; i < size; i++) {
                if (value[i].equals(value.length)) {
                    value[size++] = value[i];
                }
            }
        } else throw new NoSuchElementException();
        return (E) value[size];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleSet<?> simpleSet = (SimpleSet<?>) o;

        if (size != simpleSet.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(value, simpleSet.value);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(value);
        result = 31 * result + size;
        return result;
    }
}
