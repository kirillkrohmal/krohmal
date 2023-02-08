package ru.job4j.positivethreenum;

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = 100; i < 153; i++) {
            if (i % 10 == 7) {
                sj.add(Integer.toString(i));
            }
        }
        System.lineSeparator();
        System.out.println("Старт" + ls + sj + ls +"Финиш");
    }
}
