package ru.job4j.positeventwodigit;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = 10; i < 19; i++) {
            if (i % 2 == 0) {
                if (i % 4 == 0) {
                    sj.add(i + "#");
                } else {
                    sj.add(Integer.toString(i));
                }
            }
        }
        System.out.println("Начало" + ls + sj + ls +"Конец");
    }
}
