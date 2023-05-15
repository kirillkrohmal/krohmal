package ru.job4j.findsumeverysecondnum;

public class SecondSum {
    public static int sum(int a, int b) {
        int s = 0;
        int z;
        for (int i = a; i <= b; i+=2) {
            z = i++;
            s = i+z;

        } return s;
    }
}


