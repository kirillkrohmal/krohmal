package ru.job4j.IteratorNumTest;


import org.junit.Test;
import ru.job4j.IteratorNum.IteratorNum;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 21.09.2017.
 */


/**
 * Created by Comp on 21.09.2017.
 */

public class IteratorNumTest {
    @Test
    public void iteratorTest() {
        int[][] value = {
                {1, 2},
                {3, 4}

        };

        IteratorNum iteratorNum = new IteratorNum(value);
        int[] expected = {1, 2, 3, 4};
        iteratorNum.next();
        iteratorNum.next();
        Object result = iteratorNum.next();

        assertThat(result, is(expected));
        }
    }
