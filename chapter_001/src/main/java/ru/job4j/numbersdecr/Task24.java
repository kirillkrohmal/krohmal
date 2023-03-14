package ru.job4j.numbersdecr;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int firstNumber = num - 10;
        sj.add(Integer.toString(firstNumber));
        for (int i = 1; i < 5; i++) {
            int nextNumber = firstNumber - 6;
            sj.add(Integer.toString(nextNumber));
            firstNumber = nextNumber;
        }
        System.out.println(sj);
    }
}
