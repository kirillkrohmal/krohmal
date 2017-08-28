package ru.job4j.ExtraTasksTest.task_012;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_012.ArraysChoice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class ArraysChoiceTest {
    @Test
    public void whenAddArraySequenceAndHaveOtherUnits() {
        int[] array = {1, 0, 0};
        int unit = 1;
        ArraysChoice arrayChoice = new ArraysChoice();
        boolean result = arrayChoice.arraySequence(array, unit);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits() {
        int[] array = {1, 1, 1, 1, 1};
        int unit = 1;
        ArraysChoice arrayChoice = new ArraysChoice();
        boolean result = arrayChoice.arraySequence(array, unit);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveOtherUnits2() {
        int[] array = {0, 0, 0};
        int unit = 1;
        ArraysChoice arrayChoice = new ArraysChoice();
        boolean result = arrayChoice.arraySequence(array, unit);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits2() {
        int[] array = {0, 1, 1};
        int unit = 1;
        ArraysChoice arrayChoice = new ArraysChoice();
        boolean result = arrayChoice.arraySequence(array, unit);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}


