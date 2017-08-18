package ru.job4j.ExtraTasks;

/**
 * Задан числовой массив. Нужно проверить, что все значения в массиве одинаковые.
 * Например, [0, 0, 0] - true, [1, 1, 1] - true, [0, 1, 1] - false,
 */
public class ArraysTesting {
    private int count = 0;

    public boolean countingNum(int[] array) {
        boolean sequence = false;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] == array[i + j] && array[i + j] == array[i + j]) {
                    count++;
                    if (count >= 3) {
                        sequence = true;
                        break;
                    }
                }
                if (array[j] != array[i + j] && array[i + j] != array[i + j]) {
                    count++;
                    if (count <= 2) {
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

