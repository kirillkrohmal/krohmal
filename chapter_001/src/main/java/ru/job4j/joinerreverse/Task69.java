package ru.job4j.joinerreverse;

import java.util.StringJoiner;

public class Task69 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            sj.add(Integer.toString(arr[i]));

        }
        System.lineSeparator();
        System.out.println(sj);
    }
}
