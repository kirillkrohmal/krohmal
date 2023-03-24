package ru.job4j.outputseriesnumcertaincond;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;

        for (int i = 1; i <= 30; i += n) {
            if (count < 5) {
                count++;
                sj.add("" + i);
            }
        }

        System.out.println(sj);
    }
}
