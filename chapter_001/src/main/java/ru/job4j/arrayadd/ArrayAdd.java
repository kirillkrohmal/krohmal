package ru.job4j.arrayadd;

/**
 * Class ArrayAdd.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 07.06.2017
 */
public class ArrayAdd {
    /**
     * @return result возвращает результат
     * @since 07.06.2017
     * Метод sumClass дл¤ класса ArrayAdd вычисляет сумму двух перевернутых
     * массивов в числовой последовательности от меньшего числа к большему
     */
    public int[] sumClass(int[] array1, int[] array2) {
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

        while (y1 + y2 < result.length) {
            //если первое число в массиве меньше второго числа в массиве. проверить условие на перепополнение массива
            if (array1.length > y1 && array2.length > y2 && array1[y1] < array2[y2]) {
                result[y1 + y2] = array1[y1];
                y1++;
            } else if (array1.length > y1 && array2.length > y2 && array1[y1] >= array2[y2]) {
                result[y1 + y2] = array2[y2];
                y2++;
                // если в первом массиве остались значение то берем если нет то берем из второго массива
            } else if (array1.length > y1) {
                result[y1 + y2] = array1[y1];
                y1++;
            } else {
                result[y1 + y2] = array2[y2];
                y2++;
            }
        }
        return result;
    }
}


		
		
		
		
	
