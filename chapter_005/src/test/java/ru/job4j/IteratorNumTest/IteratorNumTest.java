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
        iteratorNum.next();
        iteratorNum.hasNext();
        boolean result = iteratorNum.hasNext();
        assertThat(result, is(true));
    }
}
