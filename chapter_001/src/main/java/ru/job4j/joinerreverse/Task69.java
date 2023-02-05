package ru.job4j.joinerreverse;

public class Task69 {
    public static void array(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]).append(" ").reverse();
        }

        String str = builder.toString();
        System.out.print(str);
    }
}
