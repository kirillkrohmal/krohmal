package ru.job4j.array;


public class RotateArray {
	public int[][] rotate(int[][] array) {	
		for(int i = 0; i < array.length;  i++) {
			for(int j = 0; j < array.length; j++) {
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}
	return array;
	}
}

		
	
	
