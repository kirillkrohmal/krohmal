package ru.job4j.outputfourdignumcertaincond;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        int num1, num2, num3, num4 = 0;
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1350; i < 1450; i++) {
            num4 = i % 10;
            num3 = i % 100/10;
            num2 = i % 1000/100;
            num1 = i / 1000 ;

            int f = num1 + num2;
            int f2 = num3 + num4;

            if (f == 5 && f2 == 5) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
