package ru.job4j.IteratorNum2;

import java.util.Iterator;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNum2 implements Iterator {
    int count = 2;
    int size = 0;
    private int[] value;

    public IteratorNum2(final int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        for (int i = 2; i < value.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i == j) {
                    return true;
                } else if (i % j == 0) {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public Object next() {
        while (hasNext() == true) {
            count++;
        }
        return value[count];
    }
}

