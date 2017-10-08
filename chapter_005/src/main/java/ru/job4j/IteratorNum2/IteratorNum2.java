package ru.job4j.IteratorNum2;

import java.util.Iterator;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNum2 implements Iterator {
    private int count = 0;
    private int size = 0;
    private int[] value;

    public IteratorNum2(final int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == i / i) {
                isPresent = true;
            } else if (i % value[i] == 0) {
                return false;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        Object o = null;
        while (hasNext() == true) {
            o = value[count++];
        }
        return o;
    }
}

