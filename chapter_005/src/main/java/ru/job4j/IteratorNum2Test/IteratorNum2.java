package ru.job4j.IteratorNum2Test;

import java.util.Iterator;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNum2 implements Iterator {
    int count = 0;
    private int[][] value;

    public IteratorNum2(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return value.length > count;
    }

    @Override
    public Object next() {
        return value[count++];
    }
}

