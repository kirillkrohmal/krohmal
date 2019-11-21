package ru.job4j.trackerlist.inputs;

/**
 * Created by Comp on 12.06.2017.
 */
public interface Input {
    int ask(String question, int[] range);

    String ask(String question);
}
