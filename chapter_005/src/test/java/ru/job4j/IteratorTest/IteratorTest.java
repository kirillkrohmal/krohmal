package ru.job4j.IteratorTest;

import org.junit.Test;

import java.util.Iterator;
import java.util.function.Consumer;

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

        ArrIterator arrIterator = new ArrIterator(value);
        int[] expected = {1, 2, 3, 4};
        arrIterator.next();
        arrIterator.hasNext();
        Object result = arrIterator.next();
        assertThat(result, is(expected));
    }
}
