package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] array = new int[2][2];
		int[][] result = rotateArray.rotate(array);
		int[][] expected = new int[2][2];
		assertThat(result, is(expected));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] array = new int[3][3];
		int[][] result = rotateArray.rotate(array);
		int[][] expected = new int[3][3];
		assertThat(result, is(expected));
    }
}