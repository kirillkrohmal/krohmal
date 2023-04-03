package ru.job4j.getdivisorsnum;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        int count = 0;
        boolean nums;

        StringJoiner sj = new StringJoiner(" ");
        sj.setEmptyValue("0");
        for (int i = 2; i < num; i++) {
            nums =  num % i == 0;

            if(nums) {
                count++;
                sj.add(Integer.toString(i));
            }
        } System.out.println("Количество: " + count + ", Делители: " + sj);
    }
}
