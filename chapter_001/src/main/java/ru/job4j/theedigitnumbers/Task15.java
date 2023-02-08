package ru.job4j.theedigitnumbers;

import java.util.StringJoiner;

public class Task15 {
    public static void loop(int a, int b) {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = a; i < b; i++) {
            if (i > 0 && i >= 100) {
                sj.add(Integer.toString(i));
            }
        }
        System.lineSeparator();
        System.out.println("Старт" + ls + sj + ls +"Финиш");
    }
}
