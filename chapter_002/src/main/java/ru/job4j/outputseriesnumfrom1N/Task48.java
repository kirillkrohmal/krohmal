package ru.job4j.outputseriesnumfrom1N;

import java.util.StringJoiner;

public class Task48 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1; i <= num; i++) {
            for (int j = i + 1; j < num; j++) {
                sj.add(i + "+" + j);
            }

        }

        System.out.println(sj);
    }
}
