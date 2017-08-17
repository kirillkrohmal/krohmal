package ru.job4j.ExtraTasks;

/**
 * Реализовать класс точку, описывающую точку в системе координат x, y - Point(x, y).
 * объект точка должен иметь методы double Point#distanceTo(Point point) -
 * метод должен вычислять расстояние между двумя точками.
 */
public class Pointer {

    double distanceTo(Point point) {

        return 0;
    }
}

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


