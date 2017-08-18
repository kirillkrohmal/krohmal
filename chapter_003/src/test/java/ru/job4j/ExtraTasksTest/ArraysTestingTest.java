package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.ArraysNumb;
import ru.job4j.ExtraTasks.ArraysTesting;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class ArraysTestingTest {
    @Test
    public void whenAddArraySequenceAndHaveOtherUnits() {
        int[] array = {0, 1, 1};
        ArraysTesting arraysTesting = new ArraysTesting();
        boolean result = arraysTesting.countingNum(array);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits() {
        int[] array = {1, 1, 1};
        ArraysTesting arraysTesting = new ArraysTesting();
        boolean result = arraysTesting.countingNum(array);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveOtherUnits2() {
        int[] array = {0, 0, 0};
        ArraysTesting arraysTesting = new ArraysTesting();
        boolean result = arraysTesting.countingNum(array);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits2() {
        int[] array = {1, 0, 1};
        ArraysTesting arraysTesting = new ArraysTesting();
        boolean result = arraysTesting.countingNum(array);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}


