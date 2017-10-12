package ru.job4j.Iterator;

import org.junit.Test;
import ru.job4j.IteratorNum2.IteratorNum2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorTest {
    @Test
    public void iteratorTest() {
        int[][] value = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {1, 2, 3, 4}
        };

        ArrIterator arrIterator = new ArrIterator(value);
        arrIterator.next();
        arrIterator.hasNext();
        Object result = arrIterator.next();
        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest2() {
        int[][] value = {
                {155}
        };
        int[][] expected = {
                {155}
        };

        ArrIterator arrIterator = new ArrIterator(value);
        Object result = arrIterator.next();
        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest3() {
        int[][] value = {
                {1, 2},
        };
        int[][] expected = {
                {1, 2},
        };

        ArrIterator arrIterator = new ArrIterator(value);
        arrIterator.next();
        arrIterator.next();
        Object result = arrIterator.next();
        assertThat(result, is(expected));
    }

    @Test
    public void iteratoTest3 () {
        ArrIterator arrIterator = new ArrIterator(new int[][]{
                {1, 2},
                {3, 4}
        });
        assertThat(arrIterator.hasNext(), is(true));
        assertThat(arrIterator.next(), is(1));
        assertThat(arrIterator.hasNext(), is(true));
        assertThat(arrIterator.next(), is(2));
        assertThat(arrIterator.hasNext(), is(true));
        assertThat(arrIterator.next(), is(3));
        assertThat(arrIterator.hasNext(), is(true));
        assertThat(arrIterator.next(), is(4));
        assertThat(arrIterator.hasNext(), is(false));
    }
}
