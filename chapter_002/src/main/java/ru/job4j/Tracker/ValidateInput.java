package ru.job4j.Tracker;


import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Comp on 28.06.2017.
 */
public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        boolean foundMatch = true;
        String subjectString = "([a-z0-9.-]+)";

        int value = -1;



        do {
            try {
                Pattern regex = Pattern.compile("([a-z0-9.-]+)");
                Matcher regexMatcher = regex.matcher(subjectString);
                foundMatch = regexMatcher.find();
                foundMatch = false;
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Необходимо ввести корректное значение");
            } catch (MenuOutException moe) {
                System.out.println("Необходимо ввести корректное значение");
            } catch (Exception e) {
                System.out.println("Необходимо ввести корректное значение");
            }
        }
        while (invalid);

        return value;
    }
}
