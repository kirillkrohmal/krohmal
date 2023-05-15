package ru.job4j.findsumsanarray;

public class Task82 {
    public static int[] array(int[] nums) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                num1 += nums[i];
            } else if (nums[i] < 0) {
                num2 += nums[i];
            } else if (nums[i] == 0) {
                num3++;
            }
        }

        int[] result = new int[3];
        result[0] = num1;
        result[1] = num2;
        result[2] = num3;

        return result;
    }
}
