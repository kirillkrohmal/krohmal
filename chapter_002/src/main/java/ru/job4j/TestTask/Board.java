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

    public Board(Cell position) {
        super(position);
    }

    public static boolean isCurrentPositionAvailable(Cell source) {
        Board board = Figure.figure;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
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
            if (cells[i].equals(figures[i].position)) {

            }
                    /*Figure position = new Bishop(dist);
                    Board.isCurrentPositionAvailable(source);
                    try {
                        figure.clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new ImpossibleMoveException("На этом месте есть фигура");
                }*/
        }

        return false;
    }
}

