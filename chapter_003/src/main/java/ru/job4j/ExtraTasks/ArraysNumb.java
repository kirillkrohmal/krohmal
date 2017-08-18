package ru.job4j.ExtraTasks;

/**
 * Задан массив чисел со значениями 0 и 1. Нужно проверить,
 * что все значения в массиве равны 1. Например, [0, 1] - false, [1, 1] - true,
 */
public class ArraysNumb {
    private int count = 0;

    public boolean arraySequence(int[] array, int unit) {
        boolean sequence = false;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] == unit && unit == array[i + j]) {
                    count++;
                    if (count > 1) {
                        sequence = true;
                        break;
                    }
                }
                if (array[j] != unit && unit != array[i + j]) {
                    sequence = false;
                    break;
                }
            }
            if (sequence) break;
        }
        return sequence;
    }
}
