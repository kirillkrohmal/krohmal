package ru.job4j.ExtraTasksTest.task_002;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_002.Point;
import ru.job4j.ExtraTasks.task_002.Pointer;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 17.08.2017.
 */
public class PointerTest {
    @Test
    public void whenAddOnePointAndTwoPointAndHasResult() {
        Pointer pointer = new Pointer(1D,1D);
        double result = pointer.PointdistanceTo(new Point(3D, 5D));
        double expected = 4.47D;
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddOnePointAndTwoPointAndHasResult2() {
        Pointer pointer = new Pointer(21D,33D);
        double result = pointer.PointdistanceTo(new Point(73D, 95D));
        double expected = 80.91D;
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddOnePointAndTwoPointAndHasResult3() {
        Pointer pointer = new Pointer(54D,65D);
        double result = pointer.PointdistanceTo(new Point(73D, 95D));
        double expected = 35.51D;
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddOnePointAndTwoPointAndHasResult4() {
        Pointer pointer = new Pointer(53D,62D);
        double result = pointer.PointdistanceTo(new Point(73D, 95D));
        double expected = 38.58D;
        assertThat(result, closeTo(expected, 0.1D));
    }
}

