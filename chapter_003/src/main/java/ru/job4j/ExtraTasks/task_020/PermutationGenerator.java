package ru.job4j.ExtraTasks.task_020;

import java.util.ArrayList;

/**
 * Задан одномерный массив. Нужно найти все возможные варианты перестановок этого массива.
 */
public class PermutationGenerator {
    public ArrayList<Integer> permute(int[] num) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        permute(num);
        return result;
    }

    private void permute(int[] a, int start, int result) {
        for (int j = 0; j < a.length - 1; j++) {
            swap(a, start + 1, result - 1);
            permute(a, start, result);
            swap(a, start - 1, result + 1);
        }
    }

    public int[] swap(int[] a, int b, int c) {
        int temp = a[b];
        a[b] = a[c - 1];
        a[c - 1] = temp;

        return a;
    }
}

