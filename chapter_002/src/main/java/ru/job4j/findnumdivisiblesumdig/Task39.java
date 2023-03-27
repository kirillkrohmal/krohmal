package ru.job4j.findnumdivisiblesumdig;

import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2, num3;

        for (int i = 200; i <= 210; i++) {
            num1 = i / 100;
            num2 = i / 10 % 10;
            num3 = i % 10;

            int f = i % (num1 + num2 + num3);

            if (f == 0) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
