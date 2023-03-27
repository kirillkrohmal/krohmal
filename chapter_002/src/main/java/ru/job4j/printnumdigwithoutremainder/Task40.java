package ru.job4j.printnumdigwithoutremainder;

import java.util.StringJoiner;

public class Task40 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2;

        for (int i = 20; i <= 40; i++) {
            num1 = i / 10;
            num2 = i % 10 ;

            int f = num1 % 3;
            int f2 = num2 % 3;

            if (f == 0 && f2 == 0) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
