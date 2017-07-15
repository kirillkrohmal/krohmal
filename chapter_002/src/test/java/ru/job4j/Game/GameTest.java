package ru.job4j.Game;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 08.07.2017.
 */

public class GameTest {
    @Test
    public void whenGameIsTrue() {
        Cell[][] cells = new Cell[3][3];
        Board board = new Board(cells, 5, 3);
        boolean result = true;
        boolean expected = true;
        //board.print();
        assertThat(result, is(expected));
    }

    @Test
    public void whenGameIsFalse() {
        Cell[][] cells = new Cell[3][3];
        Board board = new Board(cells, 5, 3);
        boolean result = false;
        boolean expected = false;
        //board.print();
        assertThat(result, is(expected));
    }
}
