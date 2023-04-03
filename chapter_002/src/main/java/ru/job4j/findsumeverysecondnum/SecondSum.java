package ru.job4j.findsumeverysecondnum;

public class SecondSum {
    public static int sum(int a, int b) {
        int s = 0;

        for (int i = a; i < b; i ++) {
            if (i > 0) {
                s = i+i;
            }
        } return s;
    }
}


