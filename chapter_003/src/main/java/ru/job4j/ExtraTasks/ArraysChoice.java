package ru.job4j.ExtraTasks;

import java.util.ArrayList;

/**
 * Задан массив чисел со значениями 0 и 1. Нужно проверить, что в
 * массиве есть последовательности из трех и больше единиц. Например, [0, 1, 1] - false, [1, 1, 1] - true,
 */
public class ArraysChoice {
    private int count = 0;

    public boolean arraySequence(int[] array, int unit) {
        boolean sequence = false;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] == unit && unit == array[i]) {
                    count++;
                    if (count >= 3) {
                        sequence = true;
                        break;
                    }
                }
                if (array[j] != unit && unit != array[i]) {
                    sequence = false;
                    break;
                }
            }
            if (sequence) break;
        }
        return sequence;
    }
}


