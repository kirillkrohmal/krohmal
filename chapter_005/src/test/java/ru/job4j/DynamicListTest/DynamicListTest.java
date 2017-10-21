package ru.job4j.DynamicListTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.ConvertIterator.ConvertIterator;
import ru.job4j.DynamicList.DynamicList;
import ru.job4j.LinkedListContainer.LinkedListContainer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class DynamicListTest<E> {
    DynamicList dynamicList;
    @Test
    public void iteratorTest() {
        dynamicList = new DynamicList();
        Object value = 7;
        int index = 7;
        Object expected = new Object();
        dynamicList.add(value);
        assertThat(dynamicList.get(index), is(expected));
    }

    @Test
    public void iteratorTest2() {
        dynamicList = new DynamicList();
        Integer value = 7;
        Object expected = new Integer(value);
        int index = 7;
        dynamicList.add(value);
        assertThat(dynamicList.get(index), is(expected));
    }

    @Before
    public void iteratorTest5() {
        dynamicList = new DynamicList();
        dynamicList.add(1);
        dynamicList.add(2);
        dynamicList.add(3);
        dynamicList.add(4);
        dynamicList.add(5);
        dynamicList.add(6);
    }

    @Test
    public void iteratorTest3() {
        Iterator<Integer> iterator = dynamicList.iterator();
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(1) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(2) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(3) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(4) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(5) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(6) );
        assertThat(iterator.hasNext(), is( false) );
    }
}
