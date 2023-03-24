package ru.job4j.outputpositiveinttwodignum;

import java.util.StringJoiner;

public class Task28 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 10; i <= 30; i++) {
            int num1 = i / 10;
            int num2 = i % 10;
            if (num1 + num2 == num) {
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
