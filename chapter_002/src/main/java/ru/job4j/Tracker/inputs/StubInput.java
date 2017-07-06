package ru.job4j.Tracker.inputs;

import ru.job4j.Tracker.inputs.Input;

/**
 * Created by Comp on 18.06.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }

   @Override
    public int ask(String question, int[] range) {
        throw new UnsupportedOperationException("UnsupportedException");
    }
}
