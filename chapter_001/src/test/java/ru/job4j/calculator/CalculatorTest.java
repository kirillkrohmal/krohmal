package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*@since 20.05.2017
*Class CalculatorTest
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*/
public class CalculatorTest {
	/**
	* Test add.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
	Calculator calc = new Calculator();
	calc.add(1D, 1D);
	double result = calc.getResult();
	double expected = 2D;
	assertThat(result, is(expected));
	}
	/**
	* Test substruct.
	*/
	@Test
	public void whenSubstructTwoSubstructOneThenOne() {
	Calculator calc = new Calculator();
	calc.substruct(2D, 1D);
	double result = calc.getResult();
	double expected = 1D;
	assertThat(result, is(expected));
	}
	/**
	* Test div.
	*/
	@Test
	public void whenDivTwoDivOneThenTwo() {
	Calculator calc = new Calculator();
	calc.div(2D, 1D);
	double result = calc.getResult();
	double expected = 2D;
	assertThat(result, is(expected));
	}
	/**
	* Test multiple.
	*/
	@Test
	public void whenMultipleTwoMultipleOneThenTwo() {
	Calculator calc = new Calculator();
	calc.multiple(2D, 1D);
	double result = calc.getResult();
	double expected = 2D;
	assertThat(result, is(expected));
	}
}