package ru.job4j.oddcount;

public class OddCount {
    public static int count(int a, int b) {
        int f = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i % 1 == 0 || j % 1 == 2) {
                    f = i++;
                    f = j++;
                }
            }
        }
        return f;
    }
}
