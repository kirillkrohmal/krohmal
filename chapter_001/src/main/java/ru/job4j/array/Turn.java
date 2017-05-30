package ru.job4j.array;



public class Turn{
	public int[] back(int[] array){
		//array[]{1,2};
				
		for(int i = 0; i < array.length/2; i++){
			int temp = array[array.length - i - 1];//записываем в переменная temp последний элемент массива в выорке
			array[array.length - i - 1] = array[i];//записываем первый элемент в последний элемент массива в выорке
			array[i] = temp;//записываем последний элемент в первый элемент массива в выорке
		}
		return array;
	}
}
