package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.FigureNotFoundException;
import ru.job4j.TestTask.Exception.ImpossibleMoveException;
import ru.job4j.TestTask.Exception.OccupiedWayException;

/**
 * Created by Comp on 03.07.2017.
 */
public class Board extends Figure {

    Figure[] figures;

    public Board(Cell position) {
        super(position);
    }


    /**
     * Метод должен должен проверить
     * Что в заданной ячейки есть фигура. если нет. то выкинуть исключение
     * Если фигура есть. Проверить может ли она так двигаться. Если нет то упадет исключение
     * Проверить что полученный путь. не занят фигурами. Если занят выкинуть исключение
     * Если все отлично. Записать в ячейку новое новое положение Figure figure.clone(Cell dist)
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {

        return false;
    }
}
