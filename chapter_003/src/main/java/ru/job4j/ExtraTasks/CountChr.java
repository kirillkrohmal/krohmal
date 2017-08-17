package ru.job4j.ExtraTasks;

import java.util.Arrays;

/**
 * Реализовать метод подсчета уникальных символов в строке.
 */
public class CountChr {
    String[] countIt(String[] array) {
        int uniq = array.length;
        for (int i = 0; i < uniq; i++) {
            for (int j = i + 1; j < uniq; j++) {
                if (array[i] != array[j]) {
                    array[j] = array[uniq - 1];
                    j--;
                    uniq--;
                }
            }
        }
        return Arrays.copyOf(array, uniq);
    }
}
