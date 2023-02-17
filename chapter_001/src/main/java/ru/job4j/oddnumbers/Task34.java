package ru.job4j.oddnumbers;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 7; i < 23; i++) {
            if (i % 4 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
