package ru.job4j.arrayTask;


public class Task {
    public boolean contains(String sub, String origin) {

        boolean result = false;

        char[] subString = sub.toCharArray();
        char[] originString = origin.toCharArray();

        int subCount = 0;
        for (int i = 0; i < originString.length; i++) {
            for (int j = 0; j < subString.length; j++) {

                if (originString[i + j] != subString[i + j]) {
                    subCount--;
                    //result = false;
                    result = subCount < 0;
                    break;
                }
                if (originString[i + j] == subString[i + j]) {
                    subCount++;
                    result = subCount > 0;
                    //result = true;
                    break;
                }
                if (result) break;
            }
        }
        return result;
    }
}







