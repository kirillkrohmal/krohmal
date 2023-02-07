package ru.job4j.multipliers;

public class Multipliers {
    public static void out(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}
