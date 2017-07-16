package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.figures.Bishop;
import ru.job4j.TestTask.figures.Castle;
import ru.job4j.TestTask.figures.Horse;
import ru.job4j.TestTask.figures.Pawn;

/**
 * Created by Comp on 03.07.2017.
 */
public abstract class Figure {
    public static Cell figure;
    private final Cell position;
    private final Cell[][] cells = new Cell[8][8];
    private ChessFigure chessFigure;

    protected Figure(Cell position) {
        this.position = position;
        this.chessFigure = chessFigure;
    }

    public Cell[][] upAndRigth (Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                cell = new Cell[][]{};
                System.out.println(String.format("%s", cell));
            }
        }
        return new Cell[][]{};
    }

    public Cell[][] upAndLeft (Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                cell = new Cell[][]{};
                System.out.println(String.format("%s", cell));
            }
        }
        return new Cell[][]{};
    }

    public Cell[][] downAndLeft (Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                cell = new Cell[][]{};
                System.out.println(String.format("%s", cell));
            }
        }
        return new Cell[][]{};
    }

    public Cell[][] downAndRigth (Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell.length; j++) {
                cell = new Cell[][]{};
                System.out.println(String.format("%s", cell));
            }
        }
        return new Cell[][]{};
    }

    public Cell cells() {
        cells[0][0] = Castle.figure;
        cells[0][2] = Bishop.figure;
        cells[0][1] = Horse.figure;
        cells[1][1] = Pawn.figure;

        return cells();
    }

   /* public Figure(Cell position) {
        this.position = position;
    }*/

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
                if (dist != null && dist == position) {
                    try {


                    } catch (ImpossibleMoveException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return new Cell[position.getHeight()][position.getWidth()];
    }
}


