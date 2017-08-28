package ru.job4j.ExtraTasks.task_002;

import ru.job4j.ExtraTasks.task_002.Point;

/**
 * Реализовать класс точку, описывающую точку в системе координат x, y - Point(x, y).
 * объект точка должен иметь методы double Point#distanceTo(Point point) -
 * метод должен вычислять расстояние между двумя точками.
 */

public class Pointer {
    public double PointdistanceTo(Point point) {
        return Math.sqrt((Math.pow(point.y - this.y, 2)) + (Math.pow(point.x - this.x, 2)));
    }

    double x;
    double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }
}




