package ru.job4j.threedigitevendigits;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        int num2, num3;
        int number = 200;
        num2 = number / 10 % 10;
        num3 = number % 10;

        StringJoiner sj = new StringJoiner(" ");
        for (int i = number; i < 223; i++) {
            num2++;
            num3++;
            if (num2 % 2 == 0 && num3 % 2 == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
