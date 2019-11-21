package ru.job4j.extratasks.task011;

/**
 * Задан массив чисел со значениями 0 и 1. Нужно проверить,
 * что все значения в массиве равны 1. Например, [0, 1] - false, [1, 1] - true,
 * Бежим по массиву, сравниваем числа с 1. Если не равно то return false.
 */
public class ArraysNumb {
    private final int[] values;
    private int count = 0;

    public ArraysNumb(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean sequence = false;
        int length = values.length;
        int unit = 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (values[j] == unit) {
                    sequence = true;
                    continue;
                } else if (values[i + j] != unit) {
                    return false;
                }
            }
            if (sequence) {
                break;
            }
        }
        return sequence;
    }
}

