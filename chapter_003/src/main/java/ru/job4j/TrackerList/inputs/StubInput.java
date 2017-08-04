package ru.job4j.TrackerList.inputs;

import java.util.ArrayList;

/**
 * Created by Comp on 18.06.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 1;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }

    @Override
    public int ask(String question, ArrayList<int[]> range) {
        throw new UnsupportedOperationException("UnsupportedException");
    }
}
