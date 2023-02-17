package ru.job4j.subsequentincr;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < num; i++) {
            num++;
            sj.add(Integer.toString(num));
            count++;
            if (count > 4) break;

        }
        System.out.println(sj);
    }
}
