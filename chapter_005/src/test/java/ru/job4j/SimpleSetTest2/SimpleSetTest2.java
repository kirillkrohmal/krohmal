package ru.job4j.SimpleSetTest2;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleSet2.SimpleSet2;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleSetTest2<E> {
    SimpleSet2<Integer> simpleSet2;

   /* @Test
    public void iteratorTest() {
        SimpleSet2 simpleSet = new SimpleSet2();
        Object e = null;
        simpleSet.next();
        simpleSet.next();
        boolean result = simpleSet.hasNext();
        Object expected = null;
        assertThat(result, is(true));
    }
*/
    @Before
    public void iteratorTest2() {
        simpleSet2 = new SimpleSet2<Integer>();

        simpleSet2.add(1);
        simpleSet2.add(2);
        simpleSet2.add(3);
        simpleSet2.add(4);
        simpleSet2.add(5);
        simpleSet2.add(6);
        simpleSet2.add(7);
        simpleSet2.add(8);
    }

    @Test
    public void iteratorTest3() {
        Iterator<Integer> iterator = simpleSet2;
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
