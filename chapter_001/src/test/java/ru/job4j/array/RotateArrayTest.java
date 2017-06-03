package ru.job4j.array;

import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] array = 
						{
							{1, 2},
							{3, 4}
						};
		int[][] result = rotateArray.rotate(array);
		int[][] expected = 
						{
							{1, 3},
							{2, 4}
						};
						  
		assertThat(result, is(expected));
    }

    
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] array = 
						{
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						};
		int[][] result = rotateArray.rotate(array);
		int[][] expected = 
						{	
							{7, 4, 1},
							{8, 5, 2},
							{9, 6, 3}
						};
		assertThat(result, is(expected));
  
  }
}
