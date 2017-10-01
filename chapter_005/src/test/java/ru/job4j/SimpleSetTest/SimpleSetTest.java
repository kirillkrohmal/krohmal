package ru.job4j.SimpleSetTest;

import org.junit.Test;
import ru.job4j.SimpleSet.SimpleSet;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleSetTest<E> {
    @Test
    public void iteratorTest() {
        SimpleSet simpleSet = new SimpleSet();
        simpleSet.next();
        simpleSet.next();
        boolean result = simpleSet.hasNext();
        Object expected = null;
        assertThat(result, is(true));
    }
}
