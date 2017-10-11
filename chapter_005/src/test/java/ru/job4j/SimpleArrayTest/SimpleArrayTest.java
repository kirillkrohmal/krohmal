package ru.job4j.SimpleArrayTest;

import org.junit.Test;
import ru.job4j.SimpleArray.SimpleArray;

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
        List<Object> value = new ArrayList<>();
        value.add(5);
        Object result = simpleArray.add(value);
        Object expected = value;
        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        SimpleArray simpleArray = new SimpleArray();
        List<Object> value = new ArrayList<>();
        List<Object> value1 = new ArrayList<>();
        simpleArray.add(value);
        Object result = simpleArray.update(value1);
        Object expected = value1;
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
        Object[] index2 = {10};
        int index = 0;
        Object result = simpleArray.get(index);
        Object expected = index2;
        assertThat(result, is(expected));
    }
}