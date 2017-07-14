package ru.job4j.ConvertList2;

import com.sun.xml.internal.ws.binding.FeatureListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * В классе ConvertList из 3-го задания 1-го урока написать метод:
 public List<Integer> convert (List<int[]> list)
 В этом методе вы должны пройтись по всем элементам всех массивов в списке list и добавить их в один общий лист Integer.

 Массивы в списке list могут быть разного размера.

 Например:
 list.add(new int[]{1, 2})
 list.add(new int[]{3, 4, 5, 6})
 List<Integer> result = convertList.convert(list)
 List<Integer> result будет содержать элементы: (1, 2, 3, 4, 5, 6)
 */
public class ConvertList2 {
    private Object convertList2;

    public static List<Integer> convert(List<int[]> list) {

        list.add(new int[]{2, 4, 6});
        list.add(new int[]{1, 4, 6, 7, 54, 5});

        List<Integer> result = ConvertList2.convert(list);

        return null;
    }
}
