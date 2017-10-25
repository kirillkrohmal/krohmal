package ru.job4j.Iterator2Test;

import org.junit.Test;
import ru.job4j.Iterator2.Iterator2;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 25.09.2017.
 */
public class Iterator2Test {
    @Test
    public void iteratorTest() {
        int[] value = {4, 2, 1, 1};
        Iterator2 iterator2 = new Iterator2(value);
        iterator2.next();
        iterator2.hasNext();
        boolean result = iterator2.hasNext();;
        assertThat(result, is(true));
    }
}
