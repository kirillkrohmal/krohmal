package ru.job4j.twodigitnumtwodigitnum;

import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 25; i <= 29; i++) {
            count++;
            sj.add(Integer.toString(i));
            if (count >= 5) break;
        }
        System.out.println(sj);
    }
}
