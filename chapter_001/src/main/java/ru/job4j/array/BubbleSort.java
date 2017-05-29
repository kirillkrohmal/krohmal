package ru.job4j.array;


public class BubbleSort{
	public int[] sort(int[] array){
		
		for(int i = 0; i < array.length; i++){
			for(int j = 1; j < array.length - i; j++){
				if(array[array.length - 1] > array[array.length])
				{
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}