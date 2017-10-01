package ru.job4j.Iterator;

import java.util.Iterator;

/**
 * Необходимо создать интератор для двухмерного массива.
 * <p>
 * int[][] value = {
 * {1, 2}
 * {3, 4}
 * };
 * <p>
 * метод next = должен вернуть последовательно 1, 2, 3, 4
 */
public class ArrIterator implements Iterator {
    int count = 0;
    private int[][] value;

    public ArrIterator(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return value[0][0] > count && value[1][1] < count && value[0][1] > count && value[1][1] < count;
    }

    @Override
    public Object next() {
        return value[count++];
    }
}





