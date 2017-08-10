package ru.job4j.ConvertListTest;


import org.junit.Test;
import ru.job4j.ConvertList.ConvertList;

import java.util.*;

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
                {4, 3, 4, 5},
                {4, 1, 2, 8}
        };
        List<Integer> result = list.toList(array);
        List<Integer> expected = new ArrayList<>();
        assertThat(result, is(expected));
    }

    @Test
    public void whenListConvertToArrays2() {
        ConvertList list = new ConvertList();
        int[][] array = {
                {4, 3, 4, 5},
                {4, 1, 2, 8}
        };
        List<Integer> result = list.toList(array);

        List<Integer> expected = new ArrayList<>();
        assertThat(result, is(expected));
    }
}
