package ru.job4j.arraycellnumoccuronce;

public class Task80 {
    public static int[] array(int[] nums) {
        int[] index = {};
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    num =  j;

                } index = new int[]{num};
            }
        }
        return index;
    }
}
