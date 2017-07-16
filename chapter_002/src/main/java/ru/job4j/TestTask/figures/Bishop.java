package ru.job4j.TestTask.figures;

import ru.job4j.TestTask.Cell;
import ru.job4j.TestTask.ChessFigure;
import ru.job4j.TestTask.Figure;

/**
 * Created by Comp on 06.07.2017.
 */
public class Bishop extends Figure {
    private int startPosition;
    private int position;
    private int x;
    private int y;

    public Bishop(Cell position, ChessFigure chessFigure) {
        super(position);
    }

    public Bishop(Cell source) {
        super(source);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int yourChoice (int x, int y) {

        return position = x + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bishop bishop = (Bishop) o;

        if (startPosition != bishop.startPosition) return false;
        if (position != bishop.position) return false;
        if (x != bishop.x) return false;
        return y == bishop.y;
    }

    @Override
    public int hashCode() {
        int result = startPosition;
        result = 31 * result + position;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }



    @Override
    public Cell[][] upAndRigth(Cell[][] cell) {
        return super.upAndRigth(cell);
    }

    @Override
    public Cell[][] upAndLeft(Cell[][] cell) {
        return super.upAndLeft(cell);
    }

    @Override
    public Cell[][] downAndLeft(Cell[][] cell) {
        return super.downAndLeft(cell);
    }

    @Override
    public Cell[][] downAndRigth(Cell[][] cell) {
        return super.downAndRigth(cell);
    }
}
