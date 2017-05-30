package ru.job4j.array;


public class RotateArray {
	public int[][] rotate(int[][] array) {
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length/4; j++){
				int temp = array[i][array.length - i - 1];
				array[i][array.length - i - 1] = array[array.length - 1][i];
				array[array.length - 1][i] = temp;
			}
		}
		return array;
	}
}