package ru.job4j.DynamicListTest;

import org.junit.Test;
import ru.job4j.ConvertIterator.ConvertIterator;
import ru.job4j.DynamicList.DynamicList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class DynamicListTest<E> {
    private String result;

    @Test
    public void iteratorTest() {
        DynamicList dynamicList = new DynamicList();
        int i = 9;
        E value = null;
        int index = 0;
        dynamicList.add(value);
        int expected = index;
        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest2() {
        DynamicList dynamicList = new DynamicList();
        E value = null;
        int index = 0;
        dynamicList.add(value);
        int expected = index;
        dynamicList.get(index);
        assertThat(result, is(expected));
    }
}
