package ru.job4j.threedigitevendigits;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 200; i < 223; i++) {
            if (i % 2 == 0) {
                sj.add(Integer.toString(i));
            }

        }
        System.lineSeparator();
        System.out.println(sj);
    }
}
