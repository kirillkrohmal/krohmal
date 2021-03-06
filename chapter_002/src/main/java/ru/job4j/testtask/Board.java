package ru.job4j.testtask;

import ru.job4j.testtask.exception.FigureNotFoundException;
import ru.job4j.testtask.exception.ImpossibleMoveException;
import ru.job4j.testtask.exception.OccupiedWayException;
import ru.job4j.testtask.figures.Bishop;

/**
 * Created by Comp on 03.07.2017.
 */
public class Board {
    private Figure[] figures;
    private int width;
    private int height;
    public Bishop[][] cells;
    public char[][] printIt;

    public Board(int width, int height, char[][] printIt) {
        this.width = width;
        this.height = height;
        this.printIt = new char[width][height];
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(printIt[i][j]);
            }
            System.out.println();
        }
    }

    int findFigure(Cell source) {
        int count = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i].equals(source)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isCurrentPositionAvailable(Cell source) {

        boolean check = false;


        return check;
    }

    public Cell getElement(Cell[][] cells, int index, char number) {
        return cells[index][number];
    }

    /**
     * Метод должен должен проверить
     * Что в заданной ячейки есть фигура. если нет. то выкинуть исключение
     * Если фигура есть. Проверить может ли она так двигаться. Если нет то упадет исключение
     * Проверить что полученный путь. не занят фигурами. Если занят выкинуть исключение
     * Если все отлично. Записать в ячейку новое новое положение Figure figure.clone(Cell dist)
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i].equals(figures)) {
                    throw new ImpossibleMoveException("Невозможно пойти. Ячейка занята!");
                } else {
                    if (width > cells.length || height > cells.length) {
                        return false;
                    } else {
                        isCurrentPositionAvailable(new Cell(3, 5));
                        //startUI.moveFigure();
                        figures.clone();
                    }
                }
            }
        }
        return false;
    }
}

