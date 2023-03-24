package ru.job4j.outputseriesconvertednum;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                sj.add("" + 0);
            } else if (i % 2 != 0) {
                sj.add("" + i*i);
            }
        }
        System.out.println(sj);
    }
}

