package ru.job4j.IteratorTest;


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
    int[] nextValue = {};

    public ArrIterator(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return value.length > count;
    }

    @Override
    public Object next() {
        while (hasNext() != false) {
            //nextValue[value] =
        }
        return value[count++];
    }
}





