package ru.job4j.testTask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraySortTest {
	
    @Test
    public void whenSortArrayAndAddThat() {
		ArraySort arrayTest = new ArraySort();
		int[] array = {1, 5, 7, 3};
		boolean result = arrayTest.sort(array);
		boolean expected = true;
		assertThat(result, is(expected));
	}
}