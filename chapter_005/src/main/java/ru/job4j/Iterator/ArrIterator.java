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
 * метод next должен последовательно проходить по каждому массиву и возвращать его элементы,
 * в текущей же реализации он просто проходится по диагонали и возвращает лишь часть значений.
 * метод next должен при каждом вызове последовательно возвращать по одному значению за раз, не более, т.е. 1,2,3 и т.д.
 */
public class ArrIterator implements Iterator {
    private int[][] value;
    private int row, column;

    public ArrIterator(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return value.length > value[row][column];
    }

    @Override
    public Object next() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                value[i] = new int[]{i};
                value[j] = new int[]{j};
            }
        }
        return value;
    }
}





