package ru.job4j.printnumevenoddnum;

public class Task55 {
    public static void loop(int[] array) {
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                count++;
            } else if (array[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println("Четных: " + count + ", нечетных: " + count2);
    }
}
