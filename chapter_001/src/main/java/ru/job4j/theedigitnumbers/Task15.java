package ru.job4j.theedigitnumbers;

import java.util.StringJoiner;

public class Task15 {
    public static void loop(int a, int b) {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = b; i > a; i--) {
            if (i >= 100) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println("Старт" + ls + sj + ls +"Финиш");

    }
}
