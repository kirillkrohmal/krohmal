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
    int counter = 0;
    E e = null;

    public SimpleSet() {
        this.value = new Object[1000];
    }

    public void add(E e) {
        if (!isDuplicate(e)) {
            if (size < value.length) {
                value[size++] = e;
            }
        }

        if (value.length <= size) {
            value = Arrays.copyOf(value, value.length*2);
        }
    }
    /**
     * Returns <tt>true</tt> if this set contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this set
     * contains an element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     * element whose presence in this set is to be tested
    */
    public boolean contains(E e) {
        boolean isContains = false;
        for (int i = 0; i < value.length; i++) {
            if (e != null && e.equals(value[i])) {
                isContains = true;
            }
        }

        return isContains;
    }

    public boolean isDuplicate(E e) {
        boolean duplicate = false;
        for (int i = 0; i < size; i++) {
            if (value[i].equals(e)) {
                duplicate = true;
                break;
            }
        }

        return duplicate;
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;

        if (contains(e)) {
            isPresent = true;
        }

        return isPresent;
    }

    @Override
    public E next() {
        E[] elem = (E[]) value[counter];
        if (hasNext()) {
            for (int i = 0; i < size; i++) {
                if (value[i] != null) {
                    value[counter++] = i;
                }
            }
        } else throw new NoSuchElementException();
        return (E) elem;
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
