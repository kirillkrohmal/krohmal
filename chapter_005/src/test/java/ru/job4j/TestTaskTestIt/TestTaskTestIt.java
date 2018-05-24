package ru.job4j.TestTaskTestIt;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.05.2018.
 */
public class TestTaskTestIt {
    @Test
    public void iteratorTest() {
        String[] expected = new String[0];
        String result = "ssdvsd";

        assertThat(result, is(expected));
    }
    @Test
    public void iteratorTest2() {
        String[] expected = new String[0];
        String result  = "ssdvsd";;

        assertThat(result, is(expected));
    }
}
