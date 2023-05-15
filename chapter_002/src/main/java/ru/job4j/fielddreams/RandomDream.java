package ru.job4j.fielddreams;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        return prizes[(num - 1) % 4];
    }
}
