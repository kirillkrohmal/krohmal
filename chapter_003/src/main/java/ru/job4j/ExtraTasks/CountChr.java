package ru.job4j.ExtraTasks;

import java.util.Arrays;

/**
 * Реализовать метод подсчета уникальных символов в строке.
 */
public class CountChr {
   public boolean countIt(char[] array) {
        boolean choice = false;

        int uniq = array.length;
        for (int i = 0; i < uniq; i++) {
            for (int j = i + 1; j < uniq; j++) {
                if (array[i] != array[j]) {
                    j--;
                    uniq--;
                    choice = true;
                }
            }
        }
        return choice;
    }
}
