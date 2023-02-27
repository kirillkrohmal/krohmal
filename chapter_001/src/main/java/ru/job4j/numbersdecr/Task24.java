package ru.job4j.numbersdecr;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i <= num; i++) {
            if (num == 50) {
                num = num - 10;
            } else {
                sj.add(Integer.toString(num));
                num = num - 6;
                count++;
                if (count >= 5) break;
            }
        }
        System.out.println(sj);
    }
}
