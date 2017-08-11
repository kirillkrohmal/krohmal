package ru.job4j.TestTask.figures;

import ru.job4j.TestTask.Cell;
import ru.job4j.TestTask.Figure;

/**
 * Created by Comp on 06.07.2017.
 */
public class Bishop extends Figure {
    private int startPosition;

    public Bishop(int x, int y, Cell position, int height, int width) {
        super(x, y, position, height, width);
    }


    @Override
    public Cell cells() {
        return super.cells();
    }

    public int upAndRigth (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (3*x - y);
                }
            }
        }

        return x;
    }

    public int upAndLeft (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (x - 2*y + 3);
                }
            }
        }
        return y;
    }

    public int downAndLeft (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (x - 2*y + 3);
                }
            }
        }
        return x;
    }

    public int downAndRigth (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (x - 2*y + 3);
                }
            }
        }
        return y;
    }
}
