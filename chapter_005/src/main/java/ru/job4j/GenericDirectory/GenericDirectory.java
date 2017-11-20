package ru.job4j.GenericDirectory;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Comp on 04.11.2017.
 */
public class GenericDirectory<T, V> implements Iterator {
    private V[] ts = (V[]) new Object[1000];
    int size = 0;

    public boolean insert(T key, V value) {

        return false;
    }

    public V get(T key) {

        return null;
    }

    public boolean delete(T key) {


        return false;
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;

        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenericDirectory<?, ?> that = (GenericDirectory<?, ?>) o;

        if (size != that.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(ts, that.ts);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(ts);
        result = 31 * result + size;
        return result;
    }
}
