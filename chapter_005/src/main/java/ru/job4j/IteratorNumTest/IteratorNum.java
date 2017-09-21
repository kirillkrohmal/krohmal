package ru.job4j.IteratorNumTest;

import java.util.Iterator;

/**
 * Создать итератор четные числа
 */
public class IteratorNum implements Iterator {
    int count = 0;
    private int[][] value;

    public IteratorNum(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return value.length > count;
    }

    @Override
    public Object next() {
        return value[count/2];
    }
}


