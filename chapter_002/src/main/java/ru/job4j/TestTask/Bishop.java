package ru.job4j.TestTask;

/**
 * Created by Comp on 06.07.2017.
 */
public class Bishop extends Figure{
    public Bishop(Cell position) {
        super(position);
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
