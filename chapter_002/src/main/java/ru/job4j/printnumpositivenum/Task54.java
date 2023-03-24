package ru.job4j.printnumpositivenum;

public class Task54 {
    public static void loop(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
