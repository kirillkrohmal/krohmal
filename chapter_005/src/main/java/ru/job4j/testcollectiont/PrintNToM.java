package ru.job4j.testcollectiont;

public class PrintNToM {
    public static void out(int n, int m) {
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                PrintNToM.out(n, m);
            }
        }
    }
}
