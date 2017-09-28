package ru.job4j.IteratorNum;

import java.util.Iterator;

/**
 * Создать итератор четные числа
 */
public class IteratorNum implements Iterator {
    int count = 0;
    int size = 0;
    private int[] value;

    public IteratorNum(final int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        for (int i = 0; i < value.length; i++) {
            if (value[size] % 2 != 0) {
                return false;
            } else {
                return true;
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




