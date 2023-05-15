package ru.job4j.printallpowerstwo1toN;

import java.util.StringJoiner;

public class Task53 {
    public static void loop(int n) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1; i <= n; i++) {
            if((i & (i - 1)) == 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
