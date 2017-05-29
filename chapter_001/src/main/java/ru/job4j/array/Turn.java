package ru.job4j.array;



public class Turn{
	public int[] back(int[] array){
		
		for(int i = 0; i < array.length; i++){
			int temp = array[array.length];
			array[array.length] = array[array.length - i];
			array[array.length - i] = temp;
		}
		return array;
	}
}
