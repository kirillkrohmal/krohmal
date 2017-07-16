package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.FigureNotFoundException;
import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.Exception.OccupiedWayException;
import ru.job4j.TestTask.figures.Bishop;

/**
 * Created by Comp on 03.07.2017.
 */
public class Board {
    private Figure figures;
    private ChessFigure chessFigures;
    private MoveChess moveChess;
    public Bishop[][] cells = new Bishop[][]{};
    private int width;
    private int hight;
    private StartUI startUI;

    public Board(int width, int hight) {
        this.width = width;
        this.hight = hight;
    }

    public Figure getFigures() {
        return figures;
    }

    public void setFigures(Figure figures) {
        this.figures = figures;
    }

    public Bishop[][] getCells() {
        return cells;
    }

    public void setCells(Bishop[][] cells) {
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
                if (cells[i].equals(source.cells[i])) {
                    throw new ImpossibleMoveException("Невозможно пойти. Ячейка занята!");
                } else {
                    if (width > cells.length || hight > cells.length) {
                        return false;
                    } else {
                       /* isCurrentPositionAvailable(new Cell(3, 5));
                        figures[i].way(cells[4]);//dist = new Bishop(figures.clone());
                        startUI.moveFigure();
                        figures.clone();*/
                    }
                }
            }
        }
        return false;
    }
}

