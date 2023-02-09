package ru.job4j.positdigitnum;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = 38; i >= 10; i--) {
            if (i % 5 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.lineSeparator();
        System.out.println("Старт" + ls + sj + ls +"Финиш");
    }
}
