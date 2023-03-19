package ru.job4j.displaynumdescarithmeticprogression;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");

        boolean sum;
        int value = num * 2;

        for (int i = 0; i > -45; i--) {
            if (i % 8 == 0) {
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
