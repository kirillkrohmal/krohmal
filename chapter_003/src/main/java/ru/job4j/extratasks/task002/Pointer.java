package ru.job4j.extratasks.task002;

/**
 * Реализовать класс точку, описывающую точку в системе координат x, y - Point(x, y).
 * объект точка должен иметь методы double Point#distanceTo(Point point) -
 * метод должен вычислять расстояние между двумя точками.
 */

public class Pointer {

    public double pointdistanceto(Point point) {
        // return Math.sqrt((Math.pow(point.y - this.y, 2)) + (Math.pow(point.x - this.x, 2)));
        return 0;
    }

    double x;
    double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }
}




