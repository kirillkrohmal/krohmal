package ru.job4j.TestTask;

/**
 * Created by Comp on 03.07.2017.
 */

import org.junit.Test;
import ru.job4j.TestTask.figures.Bishop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TaskTest {
    @Test
    public void whenAddNewFigureAndThenYourChoice() {
        Board board = new Board(8,8, new char[][]{});
        Cell source = new Cell(0, 7);
        Cell destination = new Cell(7, 0);
        Bishop bishop = new Bishop(5, 6, new Cell(4, 4), 8, 8);
        board.cells[2][7] = bishop;
        board.move(source, destination);
        assertThat(board.cells[7][0] instanceof Bishop, is(true));
    }
}




