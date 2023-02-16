package ru.job4j.ascarithprog;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        int count = 0;
        int numBegin = 3;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < numBegin; i++) {
            if (numBegin >= 3 ) {
                numBegin = numBegin + 4;
            }

            sj.add(Integer.toString(numBegin));
            count++;
            if (count >= num) {
                break;
            }

        }
        System.lineSeparator();
        System.out.println(sj);
    }
}
