package ru.job4j.subsequentincr;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < num; i++) {
            if (num % 2 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.lineSeparator();
        System.out.println(sj);
    }
}
