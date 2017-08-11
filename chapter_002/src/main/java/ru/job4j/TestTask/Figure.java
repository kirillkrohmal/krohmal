package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.figures.Bishop;
import ru.job4j.TestTask.figures.Castle;
import ru.job4j.TestTask.figures.Horse;
import ru.job4j.TestTask.figures.Pawn;

import java.util.Arrays;

/**
 * Created by Comp on 03.07.2017.
 */
public abstract class Figure {
    public static Cell figure;
    private final Cell[][] cells = new Cell[8][8];

    private int x;
    private int y;
    private Cell position;


    public Figure(int x, int y, Cell position, int height, int width) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (x != figure.x) return false;
        if (y != figure.y) return false;
        if (!Arrays.deepEquals(cells, figure.cells)) return false;
        return position != null ? position.equals(figure.position) : figure.position == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(cells);
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    public static Cell getFigure() {
        return figure;
    }

    public static void setFigure(Cell figure) {
        Figure.figure = figure;
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



    public Cell cells() {
        cells[0][0] = Castle.figure;
        cells[0][2] = Bishop.figure;
        cells[0][1] = Horse.figure;
        cells[1][1] = Pawn.figure;

        return cells();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Figure) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone();
    }

    /**
     * Добавить метод Cell[] way(Cell dist) throw ImposibleMoveException
     * Метод должен работать так. dist - задают ячейку куда следует пойти. Если фигура может туда пойти.
     * то Вернуть массив ячеек. которые должна пройти фигура.
     * Если фигура туда пойти не может. выбросить исключение ImposibleMoveException
     */
    Cell[][] way(Cell dist) throws ImpossibleMoveException {
        for (int i = 0; i < position.height; i++) {
            for (int j = 0; j < position.width; j++) {
                if (dist != null) {
                    try {


                    } catch (ImpossibleMoveException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return new Cell[][]{};
    }
}


