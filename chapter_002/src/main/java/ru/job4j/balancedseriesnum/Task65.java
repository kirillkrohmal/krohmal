package ru.job4j.balancedseriesnum;

public class Task65 {
    public static void loop(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                count1++;
            } else if (nums[i] < 0) {
                count2++;
            }
        } System.out.println(count1 == count2 ? "Да" : "Нет");

    }
}
