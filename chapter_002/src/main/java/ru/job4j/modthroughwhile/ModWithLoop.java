package ru.job4j.modthroughwhile;

public class ModWithLoop {
    public static int mod(int n, int d) {
        while(n >= d) {
            if (d > 0) {
                n = n - d;
            }

        }
        return n;
    }
}
