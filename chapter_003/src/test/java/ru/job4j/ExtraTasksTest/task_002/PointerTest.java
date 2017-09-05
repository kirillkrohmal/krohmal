package ru.job4j.ExtraTasksTest.task_002;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_002.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 17.08.2017.
 */
public class PointerTest {
    @Test
    public void whenAddOnePointAndTwoPointAndHasResult() {
        Point pointer = new Point(1,1);
        double result = pointer.distanceTo(new Point(3, 5));
        double expected = 4.47D;
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddOnePointAndTwoPointAndHasResult2() {
        Point pointer = new Point(1,1);
        double result = pointer.distanceTo(new Point(3, 5));
        double expected = 80.91D;
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddOnePointAndTwoPointAndHasResult3() {
        Point pointer = new Point(1,1);
        double result = pointer.distanceTo(new Point(3, 5));
        double expected = 35.51D;
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddOnePointAndTwoPointAndHasResult4() {
        Point pointer = new Point(1,1);
        double result = pointer.distanceTo(new Point(3, 5));
        double expected = 38.58D;
        assertThat(result, closeTo(expected, 0.1D));
    }
}

