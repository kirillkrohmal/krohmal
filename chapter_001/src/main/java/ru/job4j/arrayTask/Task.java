package ru.job4j.arrayTask;

import java.util.Arrays;


public class Task {
    public boolean contains(String sub, String origin) {
        boolean result = false;

        char[] subString = sub.toCharArray();
        char[] originString = origin.toCharArray();

        int y1 = 0;
        int y2 = 0;

        for (int i = 0; i < subString.length; i++) {
            if (originString[y1] == subString[y2] && originString.length < subString.length) {
                result = true;//originString[y1] = originString[i];
                y1++;
            } else if (originString[y1] == subString[y2] && originString.length <= subString.length) {
                result = true;
                y2++;
            } else if (originString[y1] != subString[y2] && originString.length > subString.length) {
                result = false;
            }
        }
        return result;
    }
}	





