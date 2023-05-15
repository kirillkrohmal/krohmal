package ru.job4j.comparenumdivisorstwonum;

public class Task68 {
    public static void loop(int num1, int num2) {
        boolean nums1;
        boolean nums2;
        int count1 = 0;
        int count2 = 0;

        for (int i = 1; i < num1; i++) {
            nums1 =  num1 % i == 0;

            if(nums1) {
                count1++;
            }
        }

        for (int j = 1; j < num2; j++) {
            nums2 =  num2 % j == 0;

            if(nums2) {
                count2++;
            }

        } if (count1 == count2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

