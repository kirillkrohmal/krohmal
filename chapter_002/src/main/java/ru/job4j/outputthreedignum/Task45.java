package ru.job4j.outputthreedignum;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int num2, num3;

        for (int i = 100; i <= 500; i++) {
            num2 = i / 100;
            num3 = i % 100;

            String s = num2 + "" +  num3;

            boolean f = String.valueOf(num).equals(s);

            if (f) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);
    }
}
