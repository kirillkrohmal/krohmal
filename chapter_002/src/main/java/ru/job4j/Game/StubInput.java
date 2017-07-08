package ru.job4j.Game;

/**
 * Created by Comp on 08.07.2017.
 */
public class StubInput implements Validate {

    @Override
    public String ask(String question) {
        return null;
    }

    @Override
    public int key() {
        return 0;
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
