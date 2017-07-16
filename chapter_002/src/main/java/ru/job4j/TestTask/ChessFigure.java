package ru.job4j.TestTask;

import ru.job4j.TestTask.figures.Bishop;

/**
 * Created by Comp on 06.07.2017.
 */
public class ChessFigure extends Figure {
    private int x;
    private int y;
    private Figure position;

    protected ChessFigure(Cell position) {
        super(position);
    }


    public Figure getPosition() {
        return position;
    }

    public void setPosition(Figure position) {
        this.position = position;
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

    @Override
    public String toString() {
        return "ChessFigure{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChessFigure that = (ChessFigure) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return position != null ? position.equals(that.position) : that.position == null;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
