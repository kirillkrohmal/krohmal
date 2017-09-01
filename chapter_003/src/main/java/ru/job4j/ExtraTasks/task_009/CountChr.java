package ru.job4j.ExtraTasks.task_009;

/**
 * Реализовать метод подсчета уникальных символов в строке.
 * task_009 - нужно чтобы был метод public int countIt(char[] array, char c) {} и
 * чтобы он возвращал количество букв c в массиве array.
 */
public class CountChr {
    public int countIt(char[] array, char c) {
        int uniq = array.length;
        int count = 0;

        for (int j = 0; j < uniq; j++) {
            if (c == array[j]) {
                count++;
            }
        }
        return count;
    }
}
