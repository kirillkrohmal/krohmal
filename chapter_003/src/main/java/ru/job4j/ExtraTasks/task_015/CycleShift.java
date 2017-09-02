package ru.job4j.ExtraTasks.task_015;

import java.util.ArrayList;

/**
 * Задан числовой массив. Нужно реализовать метод кольцевого сдвига на N. int[] shift().
 * Не использовать дополнительный массив. Например, [1, 2, 3, 4, 5] - shift(2) - [4, 5, 1, 2, 3]
 */
public class CycleShift {
    public int[] circularShift (int[] n, int shift) {

        shift = shift % n.length;
        for (int i = 0; i < shift; i++) {
            int temp = n[0];
            for (int j = 1; j < n.length; j++) {
                n[j - 1] = n[j];
                n[j] = temp;
            }
        }
        return n;
    }
}
