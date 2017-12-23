package ru.job4j.SimpleSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleSet<E> implements Iterator<E> {
    private Object[] value;
    private int size = 0;
    private int counter = 0;
    private E e = null;

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
            value = Arrays.copyOf(value, value.length * 2);
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
        for (Object aValue : value) {
            if (e != null && e.equals(aValue)) {
                isContains = true;
            }
        }

        return isContains;
    }

    public int size () {
        return this.size;
    }

    private boolean isDuplicate(E e) {
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
        boolean isPresent;
        return isPresent = size() != counter;
    }

    @Override
    public E next() {
        if (hasNext()) {
            return (E) value[counter++];
        } else throw new NoSuchElementException();
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
