package ru.job4j.derivepositivethreedigitnum;

import java.util.StringJoiner;

public class Task29 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2, num3;

        for (int i = 100; i <= 150; i++) {
            num1 = i / 100;
            num2 = i / 10 % 10;
            num3 = i % 10;
            if (num1 + num2 + num3 == num) {
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
