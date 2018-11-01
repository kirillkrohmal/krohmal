package ru.job4j.Bomberman;

/**
 * Created by Comp on 18.09.2018.
 */
public abstract class Figure {
    private int x;
    private int y;

    Cell[][] field;

    public Figure(Cell[][] field, int x, int y) {
        this.x = x;
        this.y = y;
        this.field = field;
    }

    public boolean isRight(Direction direction) {
        boolean result = false;

        int wright = this.x + direction.get()[0];
        int left = this.y + direction.get()[1];

        if (wright >= field.length || left >= field.length || wright < 0 || left < 0) {
            result = false;
        } else {
            synchronized (field[left][wright]) {
                if (field[wright][left].getFigure() == null) {
                    field[wright][left].setFigure(this);
                    System.out.println(String.format("%s %s:%s", Thread.currentThread().getName(), x, y));
                    field[x][y].setFigure(null);
                    this.x = wright;
                    this.y = left;
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}