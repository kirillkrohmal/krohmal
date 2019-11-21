package ru.job4j.extrataskstest.task001;

import org.junit.Test;
import ru.job4j.extratasks.task001.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 17.08.2017.
 */
public class CalcTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.plus(1, 1);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubstructTwoSubstructOneThenOne() {
        Calculator calc = new Calculator();
        calc.minus(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoDivOneThenTwo() {
        Calculator calc = new Calculator();
        calc.divide(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoDivOneThenTwo2() {
        Calculator calc = new Calculator();
        calc.divide(2D, 0);
        double result = calc.getResult();
        IllegalStateException expected = new IllegalStateException("Введите число не равное 0");
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleTwoMultipleOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
