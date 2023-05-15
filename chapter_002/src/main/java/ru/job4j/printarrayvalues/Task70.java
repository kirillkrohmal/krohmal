package ru.job4j.printarrayvalues;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                sj.add(Integer.toString(arr.length / 2));
            }
        }

        System.out.print(sj);

    }
}

