package ru.job4j.iteratornum;

import java.util.Iterator;

/**
 * Создать итератор четные числа
 */
public class IteratorNum implements Iterator {
    private int index;
    private int[] value;

    public IteratorNum(final int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        boolean isPresent = false;
        for (int i = index; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                index = i;
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    @Override
    public Object next() {
        Object o = null;
        if (hasNext()) {
            o = value[index++];
        }
        return o;
    }
}




