package ru.job4j.ExtraTasksTest.task_011;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_011.ArraysNumb;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class ArraysNumbTest {
    @Test
    public void onlyOne() {
        ArraysNumb array = new ArraysNumb(new int[]{1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    @Test
    public void notOnlyOne() {
        ArraysNumb array = new ArraysNumb(new int[]{1, 1, 0});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }

    @Test
    public void OnlyOne() {
        ArraysNumb array = new ArraysNumb(new int[]{1, 1, 1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    @Test
    public void OnlyOne2() {
        ArraysNumb array = new ArraysNumb(new int[]{1, 1, 1, 1, 1, 1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    @Test
    public void notOnlyOne2() {
        ArraysNumb array = new ArraysNumb(new int[]{0, 1, 1, 1, 1, 0});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }

    @Test
    public void notOnlyOne3() {
        ArraysNumb array = new ArraysNumb(new int[]{1, 1, 0, 1, 1, 1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }
}


