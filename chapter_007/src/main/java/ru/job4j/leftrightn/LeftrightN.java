package ru.job4j.leftrightn;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftrightN {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, -1, -2, -4, -5};

        ArrayList<Integer> arrayListotr = new ArrayList<>();
        ArrayList<Integer> arrayListpol = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arrayListotr.add(arr[i]);
            } else if (arr[i] > 0) {
                arrayListpol.add(arr[i]);
            }
        }

        for (Integer integer : arrayListpol) {
            System.out.print(integer + " ");
        }
        System.out.println();

        for (Integer integer : arrayListotr) {
            System.out.print(integer + " ");
        }
    }
}
