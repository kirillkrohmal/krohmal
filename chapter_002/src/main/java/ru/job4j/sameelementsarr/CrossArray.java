package ru.job4j.sameelementsarr;

import java.util.StringJoiner;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < left.length ; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    sj.add(Integer.toString(left[i]));
                }
            }

        }
        if (sj.toString().equals("")) {
            System.out.print(sj);
        } else {
            System.out.println(sj);
        }
    }
}
