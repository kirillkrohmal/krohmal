package ru.job4j.positivethreedignum;

import java.util.StringJoiner;

public class Task22 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 80 == 45) {
                sj.add(Integer.toString(i));
            }
        }
        System.lineSeparator();
        System.out.println(sj);
    }
}
