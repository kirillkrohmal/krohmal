package ru.job4j.Bomberman;

/**
 * Created by Comp on 18.09.2018.
 */
public abstract class Figure {
    private int x;
    private int y;

    Cell[][] boards;

    public Figure(int x, int y, Cell[][] boards) {
        this.x = x;
        this.y = y;
        this.boards = boards;
    }

    public boolean isRight(Direction direction) {
        boolean result = false;

        int wright = this.x + direction.get()[0];
        int left = this.y + direction.get()[1];

        if (wright >= boards.length || left >= boards.length || wright < 0 || left < 0) {
            result = false;
        } else {
            if (boards[wright][left].getFigure() == null) {

            } else {
                result = false;
            }

        }
        return result;
    }
}

