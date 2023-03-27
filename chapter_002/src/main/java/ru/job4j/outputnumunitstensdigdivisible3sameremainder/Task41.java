package ru.job4j.outputnumunitstensdigdivisible3sameremainder;

import java.util.StringJoiner;

public class Task41 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2;

        for (int i = 20; i <= 35; i++) {
            num1 = i / 10;
            num2 = i % 10 ;

            int f = num1 % 3;
            int f2 = num2 % 3;

            if (f == f2) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
