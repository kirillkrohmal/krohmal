package ru.job4j.arrayAdd;
/**
*Class ArrayAdd.
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 07.06.2017
*/
public class ArrayAdd {		
			/** @since 07.06.2017
		   * Метод sumClass дл¤ класса ArrayAdd вычисляет сумму двух перевернутых 
		   * массивов в числовой последовательности от меньшего числа к большему
		   * @return result возвращает результат
		   */
	public int[] sumClass (int[] array1, int[] array2) {				
		/** @since 07.06.2017
		   * @param result возвращает сумму длинн двух перевернутых массивов array1 и array2.
		   */
		int[] result = new int[array1.length + array2.length];
		/** @since 07.06.2017
		   * @param y1 первый экземпляр класса является указателем.
		   */
		int y1 = 0;
		/** @since 07.06.2017
		   * @param y2 второй экземпляр класса является указателем.
		   */
		int y2 = 0;
		
		
		while(y1 + y2 < result.length) {
			if (array1.length > y1 && array2.length > y2 && array1[y1] < array2[y2] ) { //если первое число в массиве меньше второго числа в массиве. проверить условие на перепополнение массива
				result[y1 + y2] = array1[y1];//записываем это число в массив как минимальное из двух выбранных
				y1++;//увеличиваем указатель y1 слева

			} else {
				result[y1 + y2] = array2[y2];//записываем это число в массив как минимальное из двух выбранных
				y2++;//увеличиваем указатель y2 справа
			}
		}
		return result;
	}
}

		
		
		
		
	
