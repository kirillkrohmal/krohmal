package ru.job4j.ExtraTasks.task_013;

/**
 * Задан числовой массив. Нужно проверить, что все значения в массиве одинаковые.
 * Например, [0, 0, 0] - true, [1, 1, 1] - true, [0, 1, 1] - false,
 * тут просто берешь, первый и последний элемент в массиве и сравниваешь их,
 * если не равны то return false, иначе сравниваем все оставшиеся значения массива
 * с первым или последним элементом этого массива.
 */
public class ArraysTesting {
    private int count = 0;

    public boolean countingNum(int[] array) {
        boolean sequence = false;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i] == array[array.length - j - 1]) {
                    sequence = true;
                } else if (array[i + j] == array[j + 1]) {
                    sequence = true;
                    break;
                } else if (array[i + j] != array[j + 1]) {
                    sequence = false;
                    break;
                }
            }
        }
        return sequence;
    }
}

