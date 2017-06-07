package ru.job4j.arrayAdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ArrayAddTest {
    @Test
	 public void whenSubIsEqualsOrigin() {
		ArrayAdd arrayAdd = new ArrayAdd();
		int[] array1 = new int[]{1, 3};
		int[] array2 = new int[]{2, 4};
		int[] result = arrayAdd.sumClass(array1, array2);
		int[] expected = new int[]{1, 2, 3, 4};
		assertThat(result,is(expected));
	}
}