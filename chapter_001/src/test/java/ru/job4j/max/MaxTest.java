package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** @since 21.05.2017
*Class Max
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 21.05.2017
*/

public class MaxTest {
/**
* Test add.
*/
@Test
public void whenFirstMoreThenSecond() {
	Max max1 = new Max();
	int expected = 2;
	int result = max1.max(1, 2);
	assertThat(result, is(expected));
	}
}