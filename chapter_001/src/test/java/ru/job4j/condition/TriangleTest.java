package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** @since 23.05.2017
*Class Triangle
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 23.05.2017
*/
public class TriangleTest {
/**
* Test Triangle.
*/
	@Test
	public void whenTriangleSet() {
		//assign
		double expected = 9.921567416492215;
		Point a = new Point(1, 2);
		Point b = new Point(2, 4);
		Point c = new Point(4, 2);
		Triangle triangle = new Triangle(a, b, c);
		//act
		double result = triangle.area(-3, 0, 0.3);
		//assert
		assertThat(result, is(expected, 0.01));
	}
}