package ru.job4j.twodigitnumbers;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = a; i < b; i++) {
            if (i > 0 && i >= 10) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println("Старт" + ls + sj + ls +"Финиш");
    }
}
