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
        Object result = simpleArray.add(value);
        Object expected = value;
        assertThat(result, is(expected));
    }
}