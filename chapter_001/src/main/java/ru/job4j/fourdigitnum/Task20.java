package ru.job4j.fourdigitnum;

import java.util.StringJoiner;

public class Task20 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = 1500; i >= 1100; i--) {
            if (i % 100 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.lineSeparator();
        System.out.println("Начало" + ls + sj + ls +"Конец");
    }
}

