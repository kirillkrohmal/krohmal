package ru.job4j.joiner;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner sj = new StringJoiner(" ");
        String ls = System.lineSeparator();
        for (int i = 0; i < arr.length; i++) {
            sj.add(Integer.toString(arr[i]));
        }

        System.lineSeparator();
        System.out.print(sj + ls);
    }
}
