package ru.job4j.iteratornum2test;

import org.junit.Test;
import ru.job4j.iteratornum2.IteratorNum2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class IteratorNum2Test {
    @Test
    public void iteratoTest() {
        IteratorNum2 iteratorNum2 = new IteratorNum2(new int[]{3, 4, 5, 6, 7});

        assertThat(iteratorNum2.hasNext(), is(true));
        assertThat(iteratorNum2.next(), is(3));
        assertThat(iteratorNum2.hasNext(), is(true));
        assertThat(iteratorNum2.next(), is(5));
        assertThat(iteratorNum2.hasNext(), is(true));
        assertThat(iteratorNum2.next(), is(7));
        assertThat(iteratorNum2.hasNext(), is(true));
    }
}
