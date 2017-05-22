package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 /** @since 22.05.2017
*Class PointTest
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*/
public class PointTest {
/**
* Test Point Class.
*/
	@Test
	public void whenIsAtoB()  {
		//assign block
		boolean execute = false;
		Point point = new Point(5, 1);
		//act block
		boolean result = point.is(1, 2);
		//assert block
		assertThat(result, is(execute));
	}
}