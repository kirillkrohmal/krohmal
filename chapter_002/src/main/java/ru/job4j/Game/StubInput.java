package ru.job4j.Game;

/**
 * Created by Comp on 08.07.2017.
 */
public class StubInput implements Validate {
    String[] answers;
    int position;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }

    @Override
    public void print(Cell cell, Board board) {

    }

    @Override
    public boolean isFigureMove() {
        return false;
    }

    @Override
    public boolean isFigureOnTheSameCell() {
        return false;
    }
}
