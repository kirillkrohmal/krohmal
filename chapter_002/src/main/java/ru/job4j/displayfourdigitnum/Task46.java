package ru.job4j.displayfourdigitnum;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int num2, num3 = 0;

        for (int i = 1000; i <= 1500; i++) {
            num2 = i % 1000/100;
            num3 = i % 100/10;

            String s = num2 + "" +  num3;

            boolean f = String.valueOf(num).equals(s);

            if (f) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
