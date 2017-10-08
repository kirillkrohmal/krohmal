package ru.job4j.IteratorNumTest;


import org.junit.Test;
import ru.job4j.IteratorNum.IteratorNum;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 21.09.2017.
 */

public class IteratorNumTest {
    @Test
    public void iteratorTest() {
        int[] value = {4, 2, 1, 1};
        IteratorNum iteratorNum = new IteratorNum(value);
        int[] expected = {4, 2};
        iteratorNum.next();
        int result = (Integer)iteratorNum.next();
        assertThat(result, is(expected));
    }
    @Test
    public void iteratoTest3 () {
        IteratorNum iteratorNum = new IteratorNum(new int[]{4, 2, 1, 1});
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(4));
        assertThat(iteratorNum.hasNext(), is(true));
        assertThat(iteratorNum.next(), is(2));
        assertThat(iteratorNum.hasNext(), is(false));
    }


    @Test
    public void iteratorTest2() {
        int[] value = {4, 2, 1, 1};
        IteratorNum iteratorNum = new IteratorNum(value);
        int[] expected = {4, 2};
        iteratorNum.next();
        int result = (Integer)iteratorNum.next();
        assertThat(result, is(expected));
    }
}
