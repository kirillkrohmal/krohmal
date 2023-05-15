package ru.job4j.findnumanarray;

import java.util.StringJoiner;

public class Task81 {
    public static int[] array(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                count1++;
            } else if (nums[i] < 0) {
                count2++;
            } else if (nums[i] == 0) {
                count3++;
            }
        }

        return new int[]{count2, count3, count1};
    }
}
