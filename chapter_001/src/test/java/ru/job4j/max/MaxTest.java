package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 23.05.2017
 * Class MaxTest
 * @since 23.05.2017
 */
public class MaxTest {
    /**
     * Test Max.
     */
    @Test
    public void whenFirstMoreThenSecond() {
        //assign
        int expected = 3;
        Max max1 = new Max();
        //act
        int result = max1.max(1, 2, 3);
        //assert
        assertThat(result, is(expected));
    }
}