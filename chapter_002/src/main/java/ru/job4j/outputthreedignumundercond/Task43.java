package ru.job4j.outputthreedignumundercond;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2;

        for (int i = 300; i <= 325; i++) {
            num1 = i / 100;
            num2 = i % 100;

            int f = num2 % num1;

            if (num2 > 10 && f == 0) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
