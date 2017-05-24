package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** @since 23.05.2017
*Class CounterTest
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 23.05.2017
*/
public class CounterTest {
/**
* Test Counter.
*/
@Test
public void whenSumEvenNumbersFromOneToTenThenThirty() {
	int expect = 12;
	Counter counter = new Counter();
	int result = counter.add(0, 6);
	assertThat(result, is(expect));
	}
}