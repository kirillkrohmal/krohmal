package ru.job4j.printnumgreatergivennum;

public class Task56 {
    public static void loop(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
