package ru.job4j.threadsafetest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.threadsafe.ThreadSafe;

import java.util.Iterator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 28.09.2018.
 */
public class ThreadSafeTest {
   private ThreadSafe threadSafe;

    public ThreadSafeTest(ThreadSafe threadSafe) {
        this.threadSafe = threadSafe;
    }

    @Test
    public void iteratorTest() {
        Integer value = 7;
        Integer index = 7;
        Object expected = index;
        threadSafe.add(value);

        assertThat(value, is(expected));
    }

    @Before
    public void iteratorTest2() {
        threadSafe.add(1);
        threadSafe.add(2);
        threadSafe.add(3);
        threadSafe.add(4);
        threadSafe.add(5);
        threadSafe.add(6);
    }

    @Test
    public void iteratorTest3() {
        Iterator<Integer> iterator = threadSafe.iterator();

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
