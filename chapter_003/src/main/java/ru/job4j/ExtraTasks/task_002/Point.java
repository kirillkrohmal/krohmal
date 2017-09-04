package ru.job4j.ExtraTasks.task_002;


/**
 * Реализовать класс точку, описывающую точку в системе координат x, y - Point(x, y).
 * объект точка должен иметь методы double Point#distanceTo(Point point) -
 * метод должен вычислять расстояние между двумя точками.
 */
public class Point {
    //private static final Logger log = getLogger(Point.class);

    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {
        return Math.sqrt((Math.pow(point.y - this.y, 2)) + (Math.pow(point.x - this.x, 2)));

        //throw new UnsupportedOperationException();
    }
}
