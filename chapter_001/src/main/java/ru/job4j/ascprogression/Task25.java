package ru.job4j.ascprogression;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < num; i++) {
            num = num + 4;
            sj.add(Integer.toString(num));
            count++;
            if (count > 4) break;

        }
        System.lineSeparator();
        System.out.println(sj);
    }
}
