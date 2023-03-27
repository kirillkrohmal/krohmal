package ru.job4j.printnumsumdigcurrentvalue;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        int num1, num2, num3;

        for (int i = nums[0]; i < nums.length; i++) {
            num1 = i / 100;
            num2 = i / 10 % 10;
            num3 = i % 10;

            if (num1 + num2 + num3 != 5) {
                sj.add("" + i);
            } else if (num1 + num2 + num3 == 5) {
                break;
            }
        }


    }
}
