package ru.job4j.TestTask.figures;

import ru.job4j.TestTask.Cell;
import ru.job4j.TestTask.ChessFigure;
import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.Figure;

/**
 * Created by Comp on 06.07.2017.
 */
public class Bishop extends Figure {
    private int startPosition;
    private int position;

    public Bishop(Cell position, ChessFigure chessFigure) {
        super(position);
    }



    public Bishop(Cell source) {
        super(source);
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
        return position;
    }

    public int upAndLeft (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (x - 2*y + 3);
                }
            }
        }
        return position;
    }

    public int downAndLeft (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (x - 2*y + 3);
                }
            }
        }
        return position;
    }

    public int downAndRigth (Cell[][] cell, int x, int y) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                if (cell[i][j] == cell[i][j]) {
                    return (x - 2*y + 3);
                }
            }
        }
        return position;
    }
}
