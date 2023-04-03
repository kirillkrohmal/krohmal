package ru.job4j.numprime;

import java.util.StringJoiner;

public class Task67 {
    public static void loop(int num) {
        boolean nums;

        for (int i = 1; i < num; i++) {
            nums =  num % i == 0;

            if(nums) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
