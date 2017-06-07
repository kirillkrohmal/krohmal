package ru.job4j.arrayAdd;



public class ArrayAdd {		
	public int[] sumClass (int[] array1, int[] array2) {				
		int[] result = new int[array1.length + array2.length];
		
		int y1 = 0;
		int y2 = 0;
		
		while(y1 + y2 < result.length) {
			for(int i = 0; i < result.length; i++) {
				if (array1[y1] < array2[y2]) { //если первое число в массиве меньше второго числа в массиве
					array1[i] = array1[y1];//записываем это число в массив как минимальное из двух выбранных
					y1 = array1[y1 + 1];//увеличиваем указатель y1 слева
				} else {
					array2[i] = array2[y2]; //записываем это число в массив как минимальное из двух выбранных
					y2 = array2[y2 + 1];////увеличиваем указатель y2 справа
				}
			}
		}		
		return result;		
	}
}
		
		
		
		
	
