package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class ArrayDuplicate {
    /**
     * @return Arrays.copyOf(array, uniq) возвращает результат
     * @since 17.11.2019
     * Метод remove дл¤ класса ArrayDuplicate удаляет дубликаты
     * двух строковых переменных в массиве
     */
    public String[] remove(String[] array) {
        /** @since 17.11.2019
         * @param uniq задает значение массива.
         */
        int uniq = array.length;
        for (int i = 0; i < uniq; i++) {
            for (int j = i + 1; j < uniq; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[uniq - 1];
                    j--;
                    uniq--;
                }
            }
        }
        return Arrays.copyOf(array, uniq);
    }
}