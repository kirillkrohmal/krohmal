package ru.job4j.Game2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 30.06.2017.
 */
public class Game2 {
    @Test
    public void whenThreeNotEquals2() {
        int[][] board = {
                {2, 0, 2},
                {0, 2, 0},
                {0, 0, 2}
        };
        TicTac task = new TicTac(board);
        boolean result = task.hasWin();
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
        TicTac task = new TicTac(board);
        boolean result = task.hasWin();
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

        TicTac task = new TicTac(board);
        boolean result = task.hasWin();
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
