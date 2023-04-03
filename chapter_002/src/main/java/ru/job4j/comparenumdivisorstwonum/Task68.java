package ru.job4j.comparenumdivisorstwonum;

public class Task68 {
    public static void loop(int num1, int num2) {
        boolean nums1;
        boolean nums2;
        int count = 0;

        for (int i = 1; i < num1; i++) {
            for (int j = 1; j < num2; j++) {
                nums1 =  num1 % i == 0;
                nums2 =  num2 % j == 0;

                if(nums1 || nums2) {
                    count++;
                }
            }
        } if (count % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

