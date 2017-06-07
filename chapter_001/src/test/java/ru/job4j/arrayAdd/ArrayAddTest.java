package ru.job4j.arrayAdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** 
*Class ArrayAddTest
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 07.06.2017
*/

public class ArrayAddTest {
    @Test
	 public void whenArrayPlusAnotherArray() {
		 //assign
		ArrayAdd arrayAdd = new ArrayAdd();
		int[] array1 = new int[]{1, 3};
		int[] array2 = new int[]{2, 4};
		//act
		int[] result = arrayAdd.sumClass(array1, array2);
		int[] expected = new int[]{1, 2, 3, 4};
		//assert
		assertThat(result,is(expected));
	}
}