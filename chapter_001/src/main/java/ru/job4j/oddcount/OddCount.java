package ru.job4j.oddcount;

public class OddCount {
    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0)
                count++;
        }

        return count;
    }
}
