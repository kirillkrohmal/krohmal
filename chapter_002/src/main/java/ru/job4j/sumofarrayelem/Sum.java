package ru.job4j.sumofarrayelem;

public class Sum {
    public static int getSum(int[] array) {
        int arr = 0;

        int j = array.length - 1;
        arr = array[0] + array[j];

        return arr;
    }
}
