package ru.job4j.ExtraTasks.task_012;

import java.util.ArrayList;

/**
 * Задан массив чисел со значениями 0 и 1. Нужно проверить, что в
 * массиве есть последовательности из трех и больше единиц. Например, [0, 1, 1] - false, [1, 1, 1] - true,
 * тоже перемудрил. ЗАводим локальную переменную-счетчик. Бежим по массиву и сравниваем числа с 1.
 * Если счетчик = 3 return true. Если счетчик ниразу не достиг значения 3 то false.
 */
public class  ArraysChoice {
    private final int[] values;

    public ArraysChoice(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        int count = 0;
        int one = 1;

        boolean sequence = false;
        int length = values.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (one == values[j]) {
                    count++;
                    if (count >= 3) {
                        sequence = true;
                        break;
                    }
                }
                if (one != values[i + j]) {
                    count++;
                    if (count < 2) {
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


