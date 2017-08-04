package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.FigureNotFoundException;
import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.Exception.OccupiedWayException;
import ru.job4j.TestTask.figures.Bishop;

/**
 * Created by Comp on 03.07.2017.
 */
public class Board {
    private Figure[] figures;
    private int width = 8;
    private int hight = 8;
    public Bishop[][] cells;


    public Board(Figure[] figures) {
        this.figures = figures;
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

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i].equals(source)) {
                    return true;
                } else {
                    return false;
                }
            }
            if (check) {
                System.out.println(String.format("Фигура есть? : %s", check));
            }
        }
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
                    if (width > cells.length || hight > cells.length) {
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

