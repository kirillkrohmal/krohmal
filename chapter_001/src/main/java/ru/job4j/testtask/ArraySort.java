package ru.job4j.testtask;

/**
 * Class ArraySort.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class ArraySort {
    /**
     * @return array возвращает результат
     * @since 17.11.2019
     * Метод sort дл¤ класса ArraySort сравнивает два числовых массива
     * сопоставляет их и расставляет все числа в массиве по порядку
     */
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            /** @since 17.11.2019
             * @param swap имеет отрицательное boolean значение.
             */
            boolean swap = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return array;
    }
}
