package ru.job4j.positivenumbers;

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        StringJoiner sj = new StringJoiner("");

        for (int i = 10; i < 19; i++) {
            sj.add("Начало ");
            if (i % 2 == 0) {

                sj.add("" + i);

            }
            sj.add(" Конец");
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        loop();
    }
}
