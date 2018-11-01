package ru.job4j.Bomberman;

import javafx.scene.control.Cell;

/**
 * Created by Comp on 18.09.2018.
 */
public abstract class Figure {
    private int x;
    private int y;

    Cell[][] field;

    public Figure(Cell[][] field, int x, int y) {
        this.x = x;
        this.y = y;
        this.field = field;
    }

    public boolean makeStep(Direction dir) {
        boolean result;
        final int destX = this.x + dir.get()[0];
        final int destY = this.y + dir.get()[1];
        if (destX >= field.length || destY >= field.length || destX < 0 || destY < 0) {
            result = false;
        } else {
            synchronized (field[destX][destY]) {
                if (field[destX][destY].getFigure() == null) {
                    field[destX][destY].setFigure(this);
                    System.out.println(String.format("%s %s:%s", Thread.currentThread().getName(), destX, destY));
                    field[x][y].setFigure(null);
                    this.x = destX;
                    this.y = destY;
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
