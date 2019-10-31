package ru.job4j.TrackerSQL;

import org.junit.Test;
import ru.job4j.IteratorNum.IteratorNum;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNumTest {
    @Test
    public void iteratoTest() {
        IteratorNum iteratorNum = new IteratorNum(new int[]{4, 2, 1, 1});

        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(4));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(2));
        assertThat(iteratorNum.hasNext(), is(false));
    }
}
