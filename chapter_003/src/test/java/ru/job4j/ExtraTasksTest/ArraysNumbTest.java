package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.ArraysChoice;
import ru.job4j.ExtraTasks.ArraysNumb;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class ArraysNumbTest {
    @Test
    public void whenAddArraySequenceAndHaveOtherUnits() {
        int[] array = {0, 1};
        int unit = 1;
        ArraysNumb arraysNumb = new ArraysNumb();
        boolean result = arraysNumb.arraySequence(array, unit);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits() {
        int[] array = {1, 1};
        int unit = 1;
        ArraysNumb arraysNumb = new ArraysNumb();
        boolean result = arraysNumb.arraySequence(array, unit);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveOtherUnits2() {
        int[] array = {0, 0};
        int unit = 1;
        ArraysNumb arraysNumb = new ArraysNumb();
        boolean result = arraysNumb.arraySequence(array, unit);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits2() {
        int[] array = {1, 0};
        int unit = 1;
        ArraysNumb arraysNumb = new ArraysNumb();
        boolean result = arraysNumb.arraySequence(array, unit);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}


