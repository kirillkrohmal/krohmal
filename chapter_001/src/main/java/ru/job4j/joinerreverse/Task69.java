package ru.job4j.joinerreverse;

import java.util.StringJoiner;

public class Task69 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            sj.add(Integer.toString(arr[i]));

        }
        System.out.println(sj);
    }
}
