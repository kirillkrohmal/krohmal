package ru.job4j.unambiguous;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = 1; i <= 9; i++) {
            sj.add(Integer.toString(i));
        }
        System.out.println("Старт" + ls + sj + ls +"Финиш");
    }
}


