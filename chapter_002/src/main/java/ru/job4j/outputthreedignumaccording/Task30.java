package ru.job4j.outputthreedignumaccording;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");

        int num3;
        int num4;
        for (int i = 100; i < 130; i++) {
            num3 = num % 10;
            num4 = i % 10;
            if (num4 == num3) {
                sj.add("" + i);

            }
        }
        System.out.println(sj);
    }
}


