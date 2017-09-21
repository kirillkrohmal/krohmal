package ru.job4j.ConvertIteratorTest;

import org.junit.Test;
import ru.job4j.ConvertIterator.ConvertIterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class ConvertIteratorTest {
    @Test
    public void iteratorTest() {
        Iterator<Iterator<Integer>> it = Arrays.asList(
                Collections.singletonList(1).iterator(),
                Collections.singletonList(2).iterator()
        ).iterator();
        Iterator<Integer> convert = new ConvertIterator().convert(it);
        convert.next();
        int result = convert.next();
        assertThat(result, is(2));
    }
}
