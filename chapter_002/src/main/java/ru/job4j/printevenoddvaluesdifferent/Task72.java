package ru.job4j.printevenoddvaluesdifferent;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        int[] num = {};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sj.add(Integer.toString(arr[i]));
            } else if (arr[i] % 2 != 0) {
                sj.add(Integer.toString(arr[i]));
            }
        }
        System.out.println(sj);
    }
}
