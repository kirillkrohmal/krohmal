package ru.job4j.Bomberman;

/**
 * Created by Comp on 18.09.2018.
 */
public class Cell {
    private Figure figure;

    public Figure getFigure() {
        synchronized (this) {
            return this.figure;
        }
    }

    public void setFigure(Figure figure) {
        synchronized (this) {
            this.figure = figure;
        }
    }
}
