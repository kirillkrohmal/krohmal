package ru.job4j.TestTask;

import ru.job4j.TestTask.Exception.ImpossibleMoveException;

/**
 * Created by Comp on 03.07.2017.
 */
public abstract class Figure {
    public static Board figure;
    final Cell position;

    public Figure(Cell position) {
        this.position = position;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Figure)super.clone();
        }
        catch (CloneNotSupportedException e) {
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
    Cell[] way(Cell dist) throws ImpossibleMoveException {
        for (int i = 0; i < position.height; i++) {
            for (int j = 0; j < position.width; j++) {
                if (dist == dist) {
                    try {

                    } catch (ImpossibleMoveException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        return new Cell[0];
    }
}


