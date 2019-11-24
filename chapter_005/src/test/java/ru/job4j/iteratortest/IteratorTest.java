package ru.job4j.iteratortest;

import org.junit.Test;
import ru.job4j.iterator.ArrIterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorTest {
    @Test
    public void iteratoTest3() {
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
