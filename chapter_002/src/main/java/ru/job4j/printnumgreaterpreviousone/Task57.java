package ru.job4j.printnumgreaterpreviousone;

public class Task57 {
    public static void loop(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[i++]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
