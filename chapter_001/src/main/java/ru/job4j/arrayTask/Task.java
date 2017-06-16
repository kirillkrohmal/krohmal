package ru.job4j.arrayTask;

import java.util.Arrays;


public class Task {
    public boolean contains(String sub, String origin) {
        boolean result = false;

        char[] subString = sub.toCharArray();
        char[] originString = origin.toCharArray();
        //int y1 = 0;
        //int y2 = 0;
        int uniq = originString.length;

        for (int i = 0; i < originString.length; i++) {
            result = false;
            for (int j = 0; j < subString.length; j++) {
                uniq--;
                if (uniq > 1) {
                    if (originString[i + j] == subString[j]) {
                        result = true;
                    } else {//опред количество букв равняется другим в др слове
                        result = false;
                    }
                } else {
                    if (originString[i + j] == subString[j]) {
                       return result = true;
                    }
                }
            }
        }
        return result;
    }
}





