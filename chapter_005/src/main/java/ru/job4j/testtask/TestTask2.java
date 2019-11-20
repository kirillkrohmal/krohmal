package ru.job4j.testtask;

/**
 * Created by Comp on 27.05.2018.
 */
public class TestTask2 {
/*
           работать за время О(n log n)
*/

    public boolean showAlgorithm(String[] word, String[] word1, String[] word2) {

        String temp;
        for (int i = 0; i < word.length; i++) {
            for (int j = 1; j < word1.length; j++) {

                temp = word2[j - 1];
                word2[j - 1] = word2[j];
                word2[j] = temp;
            }
        }
        return false;
    }
}

