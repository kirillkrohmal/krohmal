package ru.job4j.ExtraTasks;

import java.util.ArrayList;

/**
 * Задан числовой массив. Нужно реализовать метод кольцевого сдвига на N. int[] shift().
 * Не использовать дополнительный массив. Например, [1, 2, 3, 4, 5] - shift(2) - [4, 5, 1, 2, 3]
 */
public class CycleShift {
    public int[] circularShift (int[] n, int shift) {
        for (int i = 0; i < shift / 2; i++) {
            for (int j = n.length - 1; j > 0; j--) {
                int temp = n[i];
                n[i] = n[j - 1];
                n[j - 1] = temp;
            }
        }
        return n;
    }
}
