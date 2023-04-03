package ru.job4j.outputtwodignumdiglessinputnum;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2;

        for (int i = 10; i <= 20; i++) {
            num1 = i / 10;
            num2 = i % 10 ;

            if (num1 * num2 < num) {
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
