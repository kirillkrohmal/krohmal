package ru.job4j.ConvertList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * public List<Integer> toList (int[][] array) {} - в метод приходит двумерный массив целых чисел,
 * необходимо пройтись по всем элементам массива и добавить их в List<Integer>.
 public int[][] toArray (List<Integer> list, int rows) {} - метод toArray должен равномерно разбить
 лист на количество строк двумерного массива. В методе toArray должна быть проверка - если количество элементов
 не кратно количеству строк - оставшиеся значения в массиве заполнять нулями.
 Например в результате конвертации листа со значениями (1,2,3,4,5,6,7) с разбиением на 3 строки должен получиться
 двумерный массив {{1, 2, 3} {4, 5, 6} {7, 0 ,0}}
 */
public class ConvertList {
    public List<Integer> toList (int[][] array) {
        List<int[][]> toList = new ArrayList<>();
        array = (int[][]) toList.toArray();

        toList = Arrays.<int[][]>asList(array);

        System.out.println(toList);

        return null;
    }

    public static void main(String[] args) {
        ConvertList convertList = new ConvertList();
        convertList.toList(new int[2][2]);
    }

    private ConvertList toList(int i) {

        return null;
    }

}
