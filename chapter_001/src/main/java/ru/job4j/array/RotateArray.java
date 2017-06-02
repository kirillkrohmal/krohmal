package ru.job4j.array;


public class RotateArray {
	public int[][] rotate(int[][] array) {	
			for(int i = 0; i < array.length;  i++) {
				for(int j = i + 1; j < array.length; j++) //сравнивает текущий элемент j с последующим 
				{
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}
		return array;
	}
}

		
	
	
