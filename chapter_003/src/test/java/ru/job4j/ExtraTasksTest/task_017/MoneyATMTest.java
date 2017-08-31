package ru.job4j.ExtraTasksTest.task_017;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_018.DoubleArray;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class MoneyATMTest {
    @Test
    public void whenScanningDoubleArrayAndHaveBiggestArray() {
        int[][] array = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        DoubleArray doubleArray = new DoubleArray();
        int[][] result = doubleArray.nullCount(array);
        int[][] expected = {
                {0, 1, 1},
        };
        assertThat(result, is(expected));
    }

    @Test
    public void whenScanningDoubleArrayAndHaveBiggestArray2() {
        int[][] array = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        DoubleArray doubleArray = new DoubleArray();
        int[][] result = doubleArray.nullCount(array);
        int[][] expected = {
                {0, 1, 1},
        };
        assertThat(result, is(expected));
    }

    @Test
    public void whenScanningDoubleArrayAndHaveBiggestArray3() {
        int[][] array = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        DoubleArray doubleArray = new DoubleArray();
        int[][] result = doubleArray.nullCount(array);
        int[][] expected = {
                {0, 1, 1},
        };
        assertThat(result, is(expected));
    }

    @Test
    public void whenScanningDoubleArrayAndHaveBiggestArray4() {
        int[][] array = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        DoubleArray doubleArray = new DoubleArray();
        int[][] result = doubleArray.nullCount(array);
        int[][] expected = {
                {0, 1, 1},
        };
        assertThat(result, is(expected));
    }
}


