package ru.job4j.ConvertList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * В классе ConvertList из 3-го задания 1-го урока написать метод:
 * public List<Integer> convert (List<int[]> list)
 * В этом методе вы должны пройтись по всем элементам всех массивов в списке list и добавить
 * их в один общий лист Integer.
 * Массивы в списке list могут быть разного размера.
 * Например:
 * list.add(new int[]{1, 2})
 * list.add(new int[]{3, 4, 5, 6})
 * List<Integer> result = convertList.convert(list)
 * List<Integer> result будет содержать элементы: (1, 2, 3, 4, 5, 6)
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> integerList = new ArrayList<Integer>();

        for (int[] integer : list) {
            for (int value : integer) {
                integerList.add(value);
            }
        }
        return integerList;
    }
}
