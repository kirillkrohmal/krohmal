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
