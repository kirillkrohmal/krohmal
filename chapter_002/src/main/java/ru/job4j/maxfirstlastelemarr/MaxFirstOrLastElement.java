package ru.job4j.maxfirstlastelemarr;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        
        int result = 0;
        if (array[0] > array[array.length - 1]) {
            result =  array[0];
        } else if (array[0] < array[array.length - 1]) {
            result =  array[array.length - 1];
        }
        return result;

    }
}
