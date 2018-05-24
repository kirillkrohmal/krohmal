package ru.job4j.IteratorNumTest;

import org.junit.Test;
import ru.job4j.IteratorNum.IteratorNum;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNumTest {
    private IteratorNum iteratorNum;

    @Test
    public void iteratoTest1 () {
        iteratorNum = new IteratorNum(new int[]{2, 1, 2, 3, 1});

        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(2));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(2));
    }

    @Test
    public void iteratoTest2 () {
        iteratorNum = new IteratorNum(new int[]{1, 1, 1, 1, 1});
    }

    @Test
    public void iteratoTest3 () {
        iteratorNum = new IteratorNum(new int[]{2, 4, 6, 8, 10});

        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(2));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(4));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(6));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(8));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(10));
    }
}
