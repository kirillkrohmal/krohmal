package ru.job4j.ExtraTasks.task_020;

import java.util.ArrayList;

/**
 * Задан одномерный массив. Нужно найти все возможные варианты перестановок этого массива.
 */
public class PermutationGenerator {
    public ArrayList<int[]> permute(int[] num) {
        ArrayList<int[]> result = new ArrayList<>();
        permute(num, 0, result);
        return result;
    }

    public void permute(int[] a, int start, ArrayList<int[]> result) {
        if (start >= a.length) {
            result.add(a.clone());
        } else {
            for (int j = 0; j < a.length - 1; j++) {
                swap(a, start, j);
                permute(a, start + 1, result);
                swap(a, start, j);
            }
        }
    }

    public void swap(int[] a, int b, int c) {
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}

