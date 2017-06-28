package ru.job4j.arrayTask;


public class Task {
    public boolean contains(String sub, String origin) {

        boolean result = false;

        char[] subString = sub.toCharArray();
        char[] originString = origin.toCharArray();



        for (int i = 0; i < originString.length; i++) {
            for (int j = 0; j < subString.length; j++) {


                if (originString[i] == subString[i + j]) {
                    result = true;
                    break;
                }

                if (originString[i] != subString[i + j]) {
                    result = false;
                    break;
                }
                if (result) break;
            }

        }
        return result;
    }
}













