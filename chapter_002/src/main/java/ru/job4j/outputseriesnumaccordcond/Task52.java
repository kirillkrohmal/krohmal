package ru.job4j.outputseriesnumaccordcond;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");
        
        if (n < m) {
            for (int i = m; i < 7; i++) {
                sj.add(Integer.toString(i));
            }
        }

        if (n >= m) {
            for (int i = n; i <= 7; i++) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
