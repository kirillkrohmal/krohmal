package ru.job4j.outputthreedigitnumaccordingcertaincond;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2, num3;

        for (int i = 100; i <= 130; i++) {
            num1 = i / 100;
            num2 = i / 10 % 10;
            num3 = i % 10;
            if (num1 * num3 == Math.pow(num2, 2)) {
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
