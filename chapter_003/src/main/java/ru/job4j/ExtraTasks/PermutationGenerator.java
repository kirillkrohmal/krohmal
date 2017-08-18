package ru.job4j.ExtraTasks;

import java.util.ArrayList;

/**
 * Задан одномерный массив. Нужно найти все возможные варианты перестановок этого массива.
 */
public class PermutationGenerator {
    public ArrayList<Integer> permute(int[] num) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        permute(num,0, result);
        return result;
    }

    private void permute(int[] a, int start, ArrayList<Integer> result) {
        for (int j = 0; j < a.length - 1; j++) {
            //swap(a, start, result);
            //permute();
            //swap(a, start, result);
        }
    }

    public int[] swap(int[] a, int b, int c) {
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;

        return a;
    }
}

