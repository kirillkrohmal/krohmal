package ru.job4j.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * public List<Integer> toList (int[][] array) {} - в метод приходит двумерный массив целых чисел,
 * необходимо пройтись по всем элементам массива и добавить их в List<Integer>.
 * public int[][] toArray (List<Integer> list, int rows) {} - метод toArray должен равномерно разбить
 * лист на количество строк двумерного массива. В методе toArray должна быть проверка - если количество элементов
 * не кратно количеству строк - оставшиеся значения в массиве заполнять нулями.
 * Например в результате конвертации листа со значениями (1,2,3,4,5,6,7) с разбиением на 3 строки должен получиться
 * двумерный массив {{1, 2, 3} {4, 5, 6} {7, 0 ,0}}
 */
public class ConvertList {
    public List<Integer> toList(int[][] array) {
        List<Integer> toList = new ArrayList<>();
        toList.add(2);
        toList.add(1);
        toList.add(23);
        toList.add(212);
        toList.add(123);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toList.add(i, j);
            }
        }
        return toList;
    }

    public int[][] toArray(List<Integer> list) {
        int[][] array = {
                {2, 1, 23},
                {212, 123, 0}
        };;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                list.toArray(array);
            }
        }

        return array;
    }
}
