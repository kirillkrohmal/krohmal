package ru.job4j.SimpleSetTest2;

import org.junit.Test;
import ru.job4j.SimpleSet.SimpleSet;
import ru.job4j.SimpleSet2.SimpleSet2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleSetTest2<E> {
    @Test
    public void iteratorTest() {
        SimpleSet2 simpleSet = new SimpleSet2();
        Object e = null;
        simpleSet.next();
        simpleSet.next();
        boolean result = simpleSet.hasNext();
        Object expected = null;
        assertThat(result, is(true));
    }
}
