package ru.job4j.outputthreedignumcondition;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2, num3;

        for (int i = 100; i <= 500; i++) {
            num1 = i / 100;
            num2 = i / 10 % 10;
            num3 = i % 10;

            int f = (int)(Math.pow(num1, 2) + Math.pow(num3, 2)) ;

            if (f == Math.pow(num2, 2)) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}

