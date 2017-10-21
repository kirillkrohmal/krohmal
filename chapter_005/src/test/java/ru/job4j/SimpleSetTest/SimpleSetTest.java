package ru.job4j.SimpleSetTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleSet.SimpleSet;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleSetTest<E> {
    SimpleSet simpleSet;

    @Test
    public void iteratorTest() {
        simpleSet = new SimpleSet();
        Integer value = new Integer(4);
        E expected = (E) value;
        simpleSet.add(value);
        assertThat(value, is(expected));
    }

    @Before
    public void iteratorTest3() {
        simpleSet = new SimpleSet();

        simpleSet.add(1);
        simpleSet.add(2);
        simpleSet.add(3);
        simpleSet.add(4);
        simpleSet.add(5);
        simpleSet.add(6);
        simpleSet.add(7);
        simpleSet.add(8);
    }

    @Test
    public void iteratorTest4() {
        Iterator<Integer> iterator = simpleSet;
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
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(7));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(8));
        assertThat(iterator.hasNext(), is(false));
    }
}
