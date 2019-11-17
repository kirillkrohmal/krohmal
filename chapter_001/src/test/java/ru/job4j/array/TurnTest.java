package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 * Class TurnTest
 */
public class TurnTest {
    /**
     * Test turn.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = new int[]{2, 6, 1, 4};
        int[] result = turn.back(array);
        int[] expected = new int[]{4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] result = turn.back(array);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}