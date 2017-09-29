package ru.job4j.IteratorNum2Test;

import org.junit.Test;
import ru.job4j.IteratorNum2.IteratorNum2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class IteratorNum2Test {
    @Test
    public void iteratorTest() {
        int[] value = {1, 2, 3, 4};
        IteratorNum2 iteratorNum2 = new IteratorNum2(value);
        int[] expected = {2, 3};
        iteratorNum2.next();
        iteratorNum2.hasNext();
        Object result = iteratorNum2.hasNext();
        assertThat(result, is(true));
    }
}