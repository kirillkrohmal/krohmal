package ru.job4j.outputnumfromxtox;

import java.util.StringJoiner;

public class Task27 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int value = num * -1;

        for (int i = num - 1; i > value; i -= 2) {
            sj.add("" + i);
        }

        System.out.println(sj);
    }
}
