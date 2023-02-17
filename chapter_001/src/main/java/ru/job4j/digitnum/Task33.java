package ru.job4j.digitnum;

import java.util.StringJoiner;

public class Task33 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 7; i < 160; i++) {
            if (i % 11 == 0 && i > 100) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
