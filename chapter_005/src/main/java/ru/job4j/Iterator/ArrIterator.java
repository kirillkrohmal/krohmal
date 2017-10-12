package ru.job4j.Iterator;

import java.util.Iterator;

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
    private int[][] value = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    private int row, column = 0;
    private int count1, count2 = 0;

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
        if (value.length > value[0].length) {
            count1++;
            row++;
            isPresent = true;
           /* if (value.length > value[row].length) {
                column++;
            }*/
        } else if (value.length < value[0].length) {
            count2++;
            column++;
            isPresent = false;
        }
        return isPresent;
    }

    @Override
    public Object next() {
        if (hasNext() == true) {
            return value[row][column];
        }
        return value;
    }

    public static void main(String[] args) {
        int[][] value = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < value.length; row++) {
            for (int column = 0; column < value[row].length; column++)
                System.out.print(value[row][column] + " ");
            System.out.println();
        }
    }
}





