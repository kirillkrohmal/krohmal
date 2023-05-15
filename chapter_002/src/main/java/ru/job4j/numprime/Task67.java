package ru.job4j.numprime;


public class Task67 {
    public static void loop(int num) {
        boolean nums1;
        boolean nums2;

        for (int i = 1; i < num; i++) {
            nums1 =  num % i == 0;
            nums2 =  num % 1 == 0;

            if(nums1 && nums2) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
