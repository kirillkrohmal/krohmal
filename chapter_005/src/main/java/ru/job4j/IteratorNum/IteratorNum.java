package ru.job4j.IteratorNum;

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
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length; j++) {
                value[i][j] = value[i][j];
            }
        }
        return value[count++];
    }


}


