package ru.job4j.ExtraTasks.task_014;

/**
 * Задано предложение. Нужно переставить слова в обратно порядке. Например, "программируй и зарабатывай" ->
 * "зарабатывай и программируй"
 */
public class RearranStr {
    public String reverse(String sentence) {
        StringBuilder builder = new StringBuilder();

        String str = "";
        String[] sentFinish = sentence.split(" ");

        for (int i = sentFinish.length - 1; i >= 0; i--) {
            str = str + sentFinish[i] + " ";
        }

        return str;
    }
}

