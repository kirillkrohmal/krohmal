package ru.job4j.valuesoccuronce;

import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    break;
                } else if (j == nums.length - 1) {
                    sj.add(Integer.toString(nums[i]));
                }
            }
        }

        System.out.println(sj);
    }
}
