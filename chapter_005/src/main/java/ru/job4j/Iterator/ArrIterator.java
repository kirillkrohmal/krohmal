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
    private int[][] value;
    private int row, column;
    private int count1, count2;


    public ArrIterator(int[][] value) {
        this.value = value;
    }

    /**
     * Находишь первое значение в масиве 0 0 и возращаем его потом второе 0 1
     * берем raw проходя column(0 1 2 пока не закончатся) возвращаем значение передвигаем указатель до тех полр пока не дойдем до конца
     * пока не закончатся элементы каждый раз сбрасываем элементы raw
     * заводим значения для инкремента
     */
    @Override
    public boolean hasNext() {

        if (value.length > row) {
            count1++;
            row++;
        } else if (value.length > column) {
            count2++;
        }

        return false;
    }

    @Override
    public Object next() {


        return value;
    }
}





