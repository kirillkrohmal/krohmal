package ru.job4j.previousnum;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = num - 6; i >= num - 6 * 5; i-=6) {
            sj.add(Integer.toString(i));
        }
        System.out.println(sj);
    }
}
