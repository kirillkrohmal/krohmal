package ru.job4j.Game;

/**
 * Created by Comp on 08.07.2017.
 */
public class StubInput implements Validate {
    String[] answers;
    int move;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[move++];
    }

    @Override
    public void print(String question, int[] range) {
        throw new UnsupportedOperationException("Неверная комбинация");
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
