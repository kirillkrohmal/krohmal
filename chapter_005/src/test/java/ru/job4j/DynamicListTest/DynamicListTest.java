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
    @Test
    public void iteratorTest() {
        DynamicList dynamicList = new DynamicList();
        Object value = 7;
        int index = 7;
        Object expected = index;
        dynamicList.add(value);
        assertThat(dynamicList.get(index), is(expected));
    }

    @Test
    public void iteratorTest2() {
        DynamicList dynamicList = new DynamicList();
        Object value = 7;
        int index = 7;
        Object expected = index;
        dynamicList.add(value);
        assertThat(dynamicList.get(index), is(expected));
    }
}
