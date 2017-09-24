package ru.job4j.IteratorNum2Test;

import org.junit.Test;
import ru.job4j.Iterator.ArrIterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 21.09.2017.
 */


/**
 * Created by Comp on 21.09.2017.
 */

public class IteratorNum2Test {
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
        Object result = arrIterator.hasNext();
        assertThat(result, is(true));
    }
}