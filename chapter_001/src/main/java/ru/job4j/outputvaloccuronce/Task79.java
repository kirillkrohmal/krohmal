package ru.job4j.outputvaloccuronce;

import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sj.add(Integer.toString(nums[i]));
                } else if (j != nums.length - 1) {
                    break;
                }
            }
        }
        if (sj.toString().equals("")) {
            System.out.print(sj);
        } else {
            System.out.println(sj);
        }
    }
}
