package ru.job4j.outputthreedignumcertainconditions;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        int num1, num2, num3;
        int number;
        double number2;
        double number3;
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 144; i < 999; i ++) {
            num1 = i / 100;
            num2 = i / 10 % 10;
            num3 = i % 10;

            number = num3 * 100 + num2 * 10 + num1;
            number2 = Math.round(Math.sqrt(i * number));
            number3 = Math.sqrt(i * number);

            if(i != number && num2 != 0 && num3 != 0 && number3 == number2) {
                sj.add(Integer.toString(i));
            }

        }
        System.out.println(sj);
    }
}
