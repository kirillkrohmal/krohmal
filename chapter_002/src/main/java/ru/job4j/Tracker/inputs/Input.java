package ru.job4j.Tracker.inputs;

/**
 * Created by Comp on 12.06.2017.
 */
public interface Input {
    public String ask(String question);
    int ask(String question, int[] range);
}
