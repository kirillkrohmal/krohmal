package ru.job4j.TestTask;

/**
 * Created by Comp on 27.05.2018.
 */
public class TestTask2 {
    public String showAlgorithm(String word1, String[] word2) {
        int n = word1.length();
        String temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                temp = word2[j-1];
                word2[j-1] = word2[j];
                word2[j] = temp;
            }
        }
        return word1;
    }
}
