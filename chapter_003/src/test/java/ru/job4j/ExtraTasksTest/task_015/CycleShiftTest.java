package ru.job4j.ExtraTasksTest.task_015;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_015.CycleShift;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class CycleShiftTest {
    @Test
    public void whenAddArrayAndHaveCycleShift() {
        int[] n = {1, 2, 3, 4, 5};
        int shift = 2;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{3, 4, 5, 1, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArrayAndHaveCycleShift2() {
        int[] n = {1, 2, 3};
        int shift = 3;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArrayAndHaveCycleShift3() {
        int[] n = {3, 3, 4, 5, 1, 4, 5, 2, 1, 2};
        int shift = 4;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{1, 4, 5, 2, 1, 2, 3, 3, 4, 5};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArrayAndHaveCycleShift4() {
        int[] n = {1, 2, 3, 3, 4, 5, 1, 4, 5, 2, 1, 2, 3};
        int shift = 5;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{5, 1, 4, 5, 2, 1, 2, 3, 1, 2, 3, 3, 4};
        assertThat(result, is(expected));
    }
}


