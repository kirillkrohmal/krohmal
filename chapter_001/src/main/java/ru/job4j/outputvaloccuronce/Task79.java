package ru.job4j.outputvaloccuronce;

import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                } if (count > 1) {
                    sj.add(Integer.toString(nums[i]));
                }
            }
        }

        System.out.print(sj);

    }
}
