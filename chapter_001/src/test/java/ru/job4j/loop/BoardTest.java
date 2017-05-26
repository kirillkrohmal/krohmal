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
		String expected = String.format("x x%s x %sx x%s", line, line, line);
		final String line = System.getProperty("line.separator");
		Board board = new Board();
        //act
		String result = board.paint(3, 3);
        
        //assert
        assertThat(result, is(expected));
	}
  

    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //assign
		String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line, line);
		Board board = new Board();
		final String line = System.getProperty("line.separator");
		//act
		String result = board.paint(5, 4);
		//assert
		assertThat(result, is(expected));
		//напишите здесь тест, проверяющий формирование доски 5 на 4.
    }
}

