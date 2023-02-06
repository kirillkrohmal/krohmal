package ru.job4j.unambiguous;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        StringJoiner sj = new StringJoiner("");
        sj.add("Старт");
        System.lineSeparator();
        for (int i = 1; i <= 9; i++) {
            if (i > 0) {
                sj.add(" " + i);
            }
        }
        System.lineSeparator();
        sj.add(" Финиш");
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop();

    }
}


