package ru.job4j.ExtraTasks.task_012;

import java.util.ArrayList;

/**
 * Задан массив чисел со значениями 0 и 1. Нужно проверить, что в
 * массиве есть последовательности из трех и больше единиц. Например, [0, 1, 1] - false, [1, 1, 1] - true,
 * тоже перемудрил. ЗАводим локальную переменную-счетчик. Бежим по массиву и сравниваем числа с 1.
 * Если счетчик = 3 return true. Если счетчик ниразу не достиг значения 3 то false.
 */
public class  ArraysChoice {
    private int count = 0;
    public int one = 1;

    public boolean arraySequence(int[] array, int unit) {
        boolean sequence = false;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (one == array[i]) {
                    count++;
                    if (count >= 3) {
                        sequence = true;
                        break;
                    }
                }
                if (unit != array[i]) {
                    sequence = false;
                    if (count < 3) {
                        sequence = false;
                        break;
                    }

                }
            }
            if (sequence) break;
        }
        return sequence;
    }
}


