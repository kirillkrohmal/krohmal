package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.ImpossibleMoveException;

/**
 * Created by Comp on 03.07.2017.
 */
public abstract class Figure {
    final Cell position;

    public Figure(Cell position) {
        this.position = position;
    }

    /**
     * Добавить метод Cell[] way(Cell dist) throw ImposibleMoveException
     * Метод должен работать так. dist - задают ячейку куда следует пойти. Если фигура может туда пойти.
     * то Вернуть массив ячеек. которые должна пройти фигура.
     * Если фигура туда пойти не может. выбросить исключение ImposibleMoveException
     */
    Cell[] way(Cell dist) throws ImpossibleMoveException {


        return new Cell[0];
    }
}
