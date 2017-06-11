package ru.job4j.testTask;


public class ArraySort {
    public boolean sort(int[] array) {

        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    result = true;
                }
            }
        }
        return result;
    }
}
