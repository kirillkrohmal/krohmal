package ru.job4j.IteratorNum2;

import java.util.Iterator;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNum2 implements Iterator {
    private int count = 0;
    private int[] value;

    public IteratorNum2(final int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;
        int index = 1;
        if (index < 2) {
            isPresent = false;
        }

        while (count < value.length) {
            if (count % index == 0) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    @Override
    public Object next() {
        Object o = new Object();
        if (hasNext()) {
            o = value[count++];
        }
        return o;
    }
}

