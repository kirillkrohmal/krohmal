package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** 
*Class CounterTest
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 23.05.2017
*/
public class CounterTest {
/**
* Test Counter проверяет суммирование четных чисел от 0 до 6.
*/
@Test
public void whenSumEvenNumbersFromOneToTenThenThirty() {
	//assign block
	int expect = 12;
	Counter counter = new Counter();
	//act block
	int result = counter.add(0, 6);
	//assert block
	assertThat(result, is(expect));
	}
}