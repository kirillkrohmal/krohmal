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
	int expect = 30;
	Counter counter = new Counter();
	counter.add(i);
	int result = counter.result();
	assertThat(result1, is(expect));
}