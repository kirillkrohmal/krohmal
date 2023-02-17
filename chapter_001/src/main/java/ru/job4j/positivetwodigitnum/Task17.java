package ru.job4j.positivetwodigitnum;

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();

        for (int i = 10; i < 19; i++) {
            if (i % 2 == 0) {
                sj.add("" + i);
            }
        }

        System.out.println("Начало" + ls + sj + ls + "Конец");
    }
}

