package ru.job4j.printpositivetwodignum;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        int num2;
        int number = 50;
        StringJoiner sj = new StringJoiner(" ");

        for (int i = number; i > 0; i--) {
            num2 = i % 10;
            if (num2 == 7 && i > 10) {
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
