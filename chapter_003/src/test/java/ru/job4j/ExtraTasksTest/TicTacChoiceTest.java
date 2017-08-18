package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.TicTacChoice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 30.06.2017.
 */
public class TicTacChoiceTest {
    @Test
    public void whenThreeNotEquals2() {
        int[][] board = {
                {2, 0, 2},
                {0, 2, 0},
                {0, 0, 2}
        };
        TicTacChoice tacChoice = new TicTacChoice(board);
        boolean result = tacChoice.whoWin();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenThreeNotEquals3() {
        int[][] board = new int[][]{
                {2, 2, 2},
                {2, 0, 0},
                {2, 0, 2}

        };
        TicTacChoice tacChoice = new TicTacChoice(board);
        boolean result = tacChoice.whoWin();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenThreeNotEquals4() {
        int[][] board = {
                {0, 2, 2},
                {2, 2, 2},
                {2, 0, 2}
        };
        TicTacChoice tacChoice = new TicTacChoice(board);
        boolean result = tacChoice.whoWin();
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
