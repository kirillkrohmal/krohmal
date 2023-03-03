package ru.job4j.previousnum;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = num; i > -50; i--) {
            if (i % 6 == 0 && i < num) {
                count++;
                sj.add(Integer.toString(i));
                if (count >= 5) break;
            }
        }
        System.out.println(sj);
    }
}
