package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.Calc;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 17.08.2017.
 */
public class CalcTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calc calc = new Calc();
        calc.plus(1, 1);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubstructTwoSubstructOneThenOne() {
        Calc calc = new Calc();
        calc.minus(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoDivOneThenTwo() {
        Calc calc = new Calc();
        calc.divide(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTwoDivOneThenTwo2() {
        Calc calc = new Calc();
        calc.divide(2D, 0);
        double result = calc.getResult();
        IllegalStateException expected = new IllegalStateException("Введите число не равное 0");
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleTwoMultipleOneThenTwo() {
        Calc calc = new Calc();
        calc.multiple(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
