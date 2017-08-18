package ru.job4j.ExtraTasks;

/**
 * Задано предложение. Нужно переставить слова в обратно порядке. Например, "программируй и зарабатывай" ->
 * "зарабатывай и программируй"
 */
public class RearranStr {
    public String reverse(String sentence) {
        char temp = 0;
        int index = 0;
        char[] f = sentence.toCharArray();
        int indexLast = f.length - 1;

        temp = f[index];
        f[index] = f[indexLast];
        f[indexLast] = temp;


        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f.length; j++) {

            }
        }


        return sentence;
    }
}

