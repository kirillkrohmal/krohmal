package ru.job4j.balancedseriesnum;

public class Task65 {
    public static void loop(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean num1 = nums[i] > 0;
            boolean num2 = nums[i] < 0;
            boolean num3 = nums[i] == 0;

            if(num1 == num2) {
                count++;
            } else if (num3) {
                count+=0;
            } else if (num1 != num2) {
                count+=0;
            }
        } if (count == 1 || count == 2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
