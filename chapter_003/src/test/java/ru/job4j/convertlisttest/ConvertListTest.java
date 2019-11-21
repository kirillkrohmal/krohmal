package ru.job4j.convertlisttest;


import org.junit.Test;
import ru.job4j.convertlist.ConvertList;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 13.07.2017.
 */
public class ConvertListTest {
    @Test
    public void whenListConvertToArrays() {
        ConvertList list = new ConvertList();
        int[][] array = {
                {2, 1, 23, 212},
                {123, 0, 0, 0}
        };
        List<Integer> result = list.toList(array);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(23);
        list2.add(212);
        list2.add(123);
        List<Integer> expected = list2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenListConvertToArrays2() {
        ConvertList listConvert = new ConvertList();
        List<Integer> list = new ArrayList<>();
        int[][] result = listConvert.toArray(list);
        list.add(2);
        list.add(1);
        list.add(23);
        list.add(212);
        list.add(123);

        int[][] array = {
                {2, 1, 23},
                {212, 123, 0}
        };

        int[][] expected = array;
        assertThat(result, is(expected));
    }
}
