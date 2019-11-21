package ru.job4j.extrataskstest.task002;

import org.junit.Test;
import ru.job4j.extratasks.task002.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 17.08.2017.
 */
public class PointerTest {
    @Test
    public void whenAddOnePointAndTwoPointAndHasResult() {
        Point pointer = new Point(1, 1);
        double result = pointer.distanceTo(new Point(3, 5));
        double expected = 4.47D;
        assertThat(result, closeTo(expected, 0.1D));
    }
}

