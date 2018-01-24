package ru.job4j.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
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
    private int[][] value = new int[3][3];
    private int row = 0, column = 0;

    public ArrIterator(int[][] value) {
        this.value = value;
    }

    /**
     * Находишь первое значение в масиве 0 0 и возращаем его потом второе 0 1
     * берем raw проходя column(0 1 2 пока не закончатся) возвращаем значение передвигаем указатель до тех
     * полр пока не дойдем до конца
     * пока не закончатся элементы каждый раз сбрасываем элементы raw
     * заводим значения для инкремента
     */
    @Override
    public boolean hasNext() {
        boolean isPresent = false;
        if (value.length > row && column < value[0].length) {
            isPresent = true;
        }
        return isPresent;
    }

    @Override
    public Object next() {
        int nextValue = 0;
        if (hasNext()) {
            if (column < value[row].length) {
                nextValue = value[row][column++];
            }
            if (column == value[row].length) {
                switchElement();
            }
        } else {
            throw new NoSuchElementException();
        }
        return nextValue;
    }

    private void switchElement() {
        row++;
        column = 0;
    }
}





