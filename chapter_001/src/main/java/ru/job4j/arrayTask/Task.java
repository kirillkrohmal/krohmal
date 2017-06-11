package ru.job4j.arrayTask;

import java.util.Arrays;


public class Task {
    public boolean contains(String origin, String sub) {
        boolean result = false;

        char[] subString = sub.toCharArray();
        char[] originString = origin.toCharArray();

        int y1 = 0;
        int y2 = 0;

        for (int i = 0; i < subString.length; i++) {
            for (int j = i - 1; j < subString.length; j++) {
                if (originString[y1] == subString[y2]) {
                    y1++;
                    return true;
                } else {
                    y2++;
                    return false;
                }
            }
        }
        return result;
    }
}	





