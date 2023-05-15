package ru.job4j.intersectionmany;

import java.util.Arrays;
public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] arr = {};
        for (int i = 0; i < left.length ; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    arr = new int[]{left[i]};
                }
            }
        } return arr;
    }
}
