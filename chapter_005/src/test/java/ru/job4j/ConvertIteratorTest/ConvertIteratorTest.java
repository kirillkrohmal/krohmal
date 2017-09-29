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
    @Test
    public void iteratorTest2() {
        Iterator<Iterator<Integer>> it = Arrays.asList(
                Collections.singletonList(1).iterator(),
                Collections.singletonList(2).iterator(),
                Collections.singletonList(3).iterator(),
                Collections.singletonList(4).iterator(),
                Collections.singletonList(5).iterator(),
                Collections.singletonList(6).iterator(),
                Collections.singletonList(7).iterator(),
                Collections.singletonList(8).iterator()
        ).iterator();
        Iterator<Integer> convert = new ConvertIterator().convert(it);
        convert.next();
        int result = convert.next();
        assertThat(result, is(8));
    }

    @Test
    public void iteratorTest3() {
        Iterator<Iterator<Integer>> it = Arrays.asList(
                Collections.singletonList(1).iterator(),
                Collections.singletonList(2).iterator(),
                Collections.singletonList(3).iterator(),
                Collections.singletonList(4).iterator()
        ).iterator();
        Iterator<Integer> convert = new ConvertIterator().convert(it);
        convert.next();
        int result = convert.next();
        assertThat(result, is(4));
    }

    @Test
    public void iteratorTest4() {
        Iterator<Iterator<Integer>> it = Arrays.asList(
                Collections.singletonList(1).iterator(),
                Collections.singletonList(2).iterator(),
                Collections.singletonList(3).iterator()
        ).iterator();
        Iterator<Integer> convert = new ConvertIterator().convert(it);
        convert.next();
        int result = convert.next();
        assertThat(result, is(3));
    }@Test
    public void iteratorTest5() {
        Iterator<Iterator<Integer>> it = Arrays.asList(
                Collections.singletonList(1).iterator(),
                Collections.singletonList(2).iterator(),
                Collections.singletonList(3).iterator(),
                Collections.singletonList(4).iterator(),
                Collections.singletonList(5).iterator(),
                Collections.singletonList(6).iterator(),
                Collections.singletonList(7).iterator(),
                Collections.singletonList(8).iterator(),
                Collections.singletonList(9).iterator(),
                Collections.singletonList(10).iterator(),
                Collections.singletonList(11).iterator(),
                Collections.singletonList(12).iterator(),
                Collections.singletonList(13).iterator(),
                Collections.singletonList(14).iterator(),
                Collections.singletonList(15).iterator(),
                Collections.singletonList(16).iterator(),
                Collections.singletonList(17).iterator(),
                Collections.singletonList(18).iterator()
        ).iterator();
        Iterator<Integer> convert = new ConvertIterator().convert(it);
        convert.next();
        int result = convert.next();
        assertThat(result, is(18));
    }
}
