package ru.job4j.valuesoccuronce;

import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums[result]; j++) {
                result++;
                if (nums[i] == nums[j]) {
                    break;
                } else {
                    sj.add(Integer.toString(nums[result]));
                }
            }
        }
        System.out.println(result);
    }
}
