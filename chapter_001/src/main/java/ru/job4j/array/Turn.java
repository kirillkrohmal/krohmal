package ru.job4j.array;

/**
 * Class Turn.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 */
public class Turn {
    /**
     * @return array возвращает результат
     * @since 17.11.2019
     * Метод back дл¤ класса RotateArray перемещает числа
     * в массиве зодом наперед
     */
    public int[] back(int[] array) {
        //array[]{1,2};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
