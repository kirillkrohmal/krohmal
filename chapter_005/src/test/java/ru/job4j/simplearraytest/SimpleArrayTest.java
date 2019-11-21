package ru.job4j.simplearraytest;

import org.junit.Test;
import ru.job4j.simplearray.SimpleArray;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 22.09.2017.
 */
public class SimpleArrayTest {
    @Test
    public void iteratorTest() {
        SimpleArray simpleArray = new SimpleArray();

        List<Object> expected = new ArrayList<>();
        expected.add(5);
        Object result = simpleArray.add(expected);

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest2() {
        SimpleArray simpleArray = new SimpleArray();

        List<Object> value = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        simpleArray.add(value);
        Object result = simpleArray.update(expected);

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest3() {
        SimpleArray simpleArray = new SimpleArray();

        List<Object> value = new ArrayList<>();
        value.add(5);
        Object result = simpleArray.delete(value);
        Object expected = null;

        assertThat(result, is(expected));
    }

    @Test
    public void iteratorTest4() {
        SimpleArray simpleArray = new SimpleArray();

        Object[] expected = {10};
        int index = 0;
        Object result = simpleArray.get(index);

        assertThat(result, is(expected));
    }
}