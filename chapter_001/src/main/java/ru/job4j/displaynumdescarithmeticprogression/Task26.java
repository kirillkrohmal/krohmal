package ru.job4j.displaynumdescarithmeticprogression;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int value = num * -8;

        for (int i = 0; i > 2 * value; i -= 8) {
            sj.add("" + i);
        }

        System.out.println(sj);
    }
}
