package ru.job4j.dividethreedigitnum;

import java.util.StringJoiner;

public class Task21 {
    public static void separate(int number) {
        String num = String.valueOf(number);
        StringJoiner sj = new StringJoiner(" ");

        for(int i = num.length() - 1; i > -1; i--) {
            int j = Character.digit(num.charAt(i), 10);
            sj.add(Integer.toString(j));
        }
        System.out.println(sj);
    }
}
