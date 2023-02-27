package ru.job4j.twodignumsepar;

import java.util.StringJoiner;

public class Task20 {
    public static void separate(int number) {
        String num = String.valueOf(number);
        StringJoiner sj = new StringJoiner(" ");

        for(int i = 0; i < num.length(); i++) {
            int j = Character.digit(num.charAt(i), 10);
            sj.add(Integer.toString(j));
        }
        System.out.println(sj);
    }
}
