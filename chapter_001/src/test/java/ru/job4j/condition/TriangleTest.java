package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/** @since 23.05.2017
*Class TriangleTest
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
		double expected = 1.73D;
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		Triangle triangle = new Triangle(a, b, c);
		//act
		double result = triangle.area();
		//assert
		assertThat(result, closeTo(expected, 0.1D));
	}
}