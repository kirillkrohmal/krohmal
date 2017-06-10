package ru.job4j.array;


public class BubbleSort{
	public int[] sort(int[] array){
		
		for(int i = 0; i < array.length; i++){
			for(int j = 1; j < array.length; j++){//от 1 до  элемента в массиве i-го элемента идет сокращение элементов которые перебраны
				if(array[j - 1] > array[j])//пока последний элемент больше первого элемента 
				{
					int temp = array[j - 1];//записываем в переменную temp последний элемент массива
					array[j - 1] = array[j];//меняем местами последний элемент массива с первым элементом массива
					array[j] = temp;//записываем из переменной temp в первый элемент массива поочередно
				}
			}
		}
		return array;
	}
}