package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.CycleShift;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class CycleShiftTest {
    @Test
    public void whenAddArrayAndHaveCycleShift() {
        int[] n = {1, 2, 3};
        int shift = 2;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{2, 1, 3};
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
        int[] n = {1, 2, 3};
        int shift = 2;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArrayAndHaveCycleShift4() {
        int[] n = {1, 2, 3};
        int shift = 2;
        CycleShift cycleShift = new CycleShift();
        int[] result = cycleShift.circularShift(n, shift);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result, is(expected));
    }
}


