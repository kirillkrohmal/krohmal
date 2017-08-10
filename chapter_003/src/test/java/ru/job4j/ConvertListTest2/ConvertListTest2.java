package ru.job4j.ConvertListTest2;


import org.junit.Test;
import ru.job4j.ConvertList2.ConvertList;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 13.07.2017.
 */
public class ConvertListTest2 {
    @Test
    public void whenConvertListToInteger() {
        ConvertList convertList2 = new ConvertList();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> result = convertList2.convert(list);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> expected = list2;
        assertThat(result, is(expected));
    }
}
