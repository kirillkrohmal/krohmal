package ru.job4j.twodigitnumdivisible;



public class Task58 {
    public static void loop(int num) {
        int count = 0;
        int num1;

        for (int i = 10; i <= 20; i++) {
            num1 = num / i;

            if (num1 % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
