package ru.job4j.outputseriesconvertednum;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sj.add(Integer.toString(0));
            } else if (i % 2 != 0) {
                sj.add("" + i*i);
            }
        }

        System.out.println(sj);
    }
}

