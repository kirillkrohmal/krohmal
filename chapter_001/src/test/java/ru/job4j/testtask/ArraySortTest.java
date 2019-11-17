package ru.job4j.testtask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraySortTest {
    @Test
    public void whenSortArrayAndAddThat() {
		ArraySort arrayTest = new ArraySort();
		int[] array = new int[]{1, 5, 2, 12};
        int[] result = arrayTest.sort(array);
        int[] expected = new int[]{1, 2, 5, 12};
        assertThat(result, is(expected));
	}
}