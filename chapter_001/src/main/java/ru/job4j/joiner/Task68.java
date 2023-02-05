package ru.job4j.joiner;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Task68 {
    public static void array(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]).append(" ");
        }

        String str = builder.toString();


        System.out.println(str);

    }
}
