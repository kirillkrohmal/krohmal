package ru.job4j.array;

import java.util.Comparator;

/**
 * Class BubbleSort.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class BubbleSort {
    /**
     * @return array возвращает результат
     * @since 17.11.2019
     * Метод sort дл¤ класса BubbleSort сортирует числовой массив
     */
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}