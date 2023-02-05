package ru.job4j.parentheses;

public class Parentheses {
    public static boolean valid(char[] data) {
        if (data.length % 2 != 0) return false;
        int d = 0;
        for (int i = 0; i < data.length; i++) {
            d += data[i] == '(' ? 1 : -1;
            if (d < 0) return false;
        }
        return true;
    }
}
