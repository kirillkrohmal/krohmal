package ru.job4j.oddnumbers;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = num; i < 30; i++) {

            if (i % 2 != 0 && i > num) {
                count++;
                sj.add(Integer.toString(i));
                if (count >= 5) break;
            }
        }
        System.out.println(sj);
    }
}
