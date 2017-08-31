package ru.job4j.ExtraTasks.task_014;

/**
 * Задано предложение. Нужно переставить слова в обратно порядке. Например, "программируй и зарабатывай" ->
 * "зарабатывай и программируй"
 */
public class RearranStr {
    public String reverse(String sentence) {
        char temp = 0;
        int index = 0;
        char[] f = sentence.toCharArray();
        int indexFirst = f.length;

        for (int i = 0; i < indexFirst; i++) {
            for (int j = 0; j < indexFirst ; j++) {
                temp = f[indexFirst / 2];
                f[indexFirst / 2] = f[indexFirst - i - 1];
                f[indexFirst - i - 1] = temp;
            }
        }

        return sentence;
    }
}

