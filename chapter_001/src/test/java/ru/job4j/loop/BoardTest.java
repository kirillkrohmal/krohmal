package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/** 
*Class BoardTest
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 26.05.2017
*/
public class BoardTest {
/**
* Test Board.
*/  
  @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        //assign
		Board board = new Board();
		final String line = System.getProperty("line.separator");
        //act
		String result = board.paint(3, 3);
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        //assert
        assertThat(result, is(expected));
	}
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //assign
		Board board = new Board();
		final String line = System.getProperty("line.separator");
		//act
		String result = board.paint(5, 4);
		String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line, line);
		//assert
		assertThat(result, is(expected));
    }
}

