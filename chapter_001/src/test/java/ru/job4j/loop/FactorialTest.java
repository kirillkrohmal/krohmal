package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class FactorialTest
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 24.05.2017
 */
public class FactorialTest {
    /**
     * Test Factorial.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //assign block
        int expect = 120;
        Factorial factorial = new Factorial();
        //act block
        int result = factorial.calc(5);
        //assert block
        assertThat(result, is(expect));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //assign block
        int expect = 1;
        Factorial factorial = new Factorial();
        //act block
        int result = factorial.calc(0);
        //assert block
        assertThat(result, is(expect));
    }
}