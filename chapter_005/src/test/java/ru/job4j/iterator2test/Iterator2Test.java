package ru.job4j.iterator2test;

import org.junit.Test;
import ru.job4j.iterator2.ArrIterator2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 25.09.2017.
 */
public class Iterator2Test {
    @Test
    public void iteratorTest() {
        int[] value = {4, 2, 1, 1};

        ArrIterator2 arrIterator2 = new ArrIterator2(value);
        arrIterator2.next();
        arrIterator2.hasNext();
        boolean result = arrIterator2.hasNext();

        assertThat(result, is(true));
    }
}
