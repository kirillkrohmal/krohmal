package ru.job4j.testtask;

/**
 * Created by Comp on 20.05.2018.
 */
public class TestTask {
    public boolean showAlgorithm(String[] word, String[] word1, String[] word2) {

/*
            работать за время О(n)
*/
        boolean isChoice = false;
        int uniq = word.length;
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < uniq; i++) {
            for (int j = 0; j < uniq; j++) {
                if (word[i].equals(word1[j])) {
                    count++;
                    break;
                } else if (word[i].equals(word2[j])) {
                    count2++;
                    break;
                }
            }
            if (count > 1) {
                isChoice = true;
            } else if (count2 < 1) {
                isChoice = false;
            }
        }
        return isChoice;
    }
}



