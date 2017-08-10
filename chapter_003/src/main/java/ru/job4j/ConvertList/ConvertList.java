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
    public List<Integer> toList(int[][] array1) {
        List<Integer> toList = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                toList.add(i, j);
            }
        }
        System.out.println(toList);
        return toList;
    }

    public int[][] toArray(List<Integer> list) {
        list = new ArrayList<>();
        int[][] array = {
                {5, 5},
                {4, 5},
                {5, 6}
        };
        //list = new ArrayList<>(array.length);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                list.toArray(array);
            }
        }

        System.out.println(list);
        return array;
    }

    public static void main(String[] args) {
        ConvertList convertList = new ConvertList();
        //convertList.toArray();
        int[][] array = {
                {5, 5},
                {4, 5},
                {5, 6}
        };
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(23);
        list.add(212);
        list.add(123);
        convertList.toArray(list);
    }
}
