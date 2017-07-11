package ru.job4j.Game;

/**
 * Created by Comp on 07.07.2017.
 */
public interface Validate {
    String ask(String question);
    void print(Cell cell, Board board);

    public abstract boolean isFigureMove();
    public abstract boolean isFigureOnTheSameCell();
}
