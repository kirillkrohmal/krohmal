package ru.job4j.dynamiclisttest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.DynamicListThread.DynamicListThread.DynamicListThread;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class DynamicListTest<E> {
    private DynamicListThread dynamicList;

    @Test
    public void iteratorTest() {
        dynamicList = new DynamicListThread();

        Integer value = 7;
        Integer index = 7;
        Object expected = index;
        dynamicList.add(value);

        assertThat(value, is(expected));
    }

    @Before
    public void iteratorTest2() {
        dynamicList = new DynamicListThread();

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

        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(1));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(3));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(4));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(5));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(6));
        assertThat(iterator.hasNext(), is(false));
    }
}
