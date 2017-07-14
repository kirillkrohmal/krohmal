package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.FigureNotFoundException;
import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.Exception.OccupiedWayException;

/**
 * Created by Comp on 03.07.2017.
 */
public class Board extends Figure {
    Figure[] figures;
    Cell[][] cells = new Cell[][]{};
    private int width;
    private int hight;

    public Board(Cell position, Figure[] figures, Cell[][] cells, int width, int hight) {
        super(position);
        this.figures = figures;
        this.cells = cells;
        this.width = width;
        this.hight = hight;
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public boolean isCurrentPositionAvailable(Cell source) {
        Board board = Figure.figure;

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (source == null) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * Метод должен должен проверить
     * Что в заданной ячейки есть фигура. если нет. то выкинуть исключение
     * Если фигура есть. Проверить может ли она так двигаться. Если нет то упадет исключение
     * Проверить что полученный путь. не занят фигурами. Если занят выкинуть исключение
     * Если все отлично. Записать в ячейку новое новое положение Figure figure.clone(Cell dist)
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        for (int i = 0; i < figures.length; i++) {
            if (cells[i].equals(source.cells[i])) {
                throw new ImpossibleMoveException("Невозможно пойти. Ячейка занята!");
            } else {
                if (width > cells.length || hight > cells.length) {
                    return false;
                }
                else {
                    try {
                        figure.clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }
}

