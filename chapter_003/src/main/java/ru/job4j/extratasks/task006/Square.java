package ru.job4j.extratasks.task006;

import ru.job4j.extratasks.task002.Point;

/**
 * Реализовать класс квадрат основанный на четырех точках Point(x, y). boolean exists() -
 * проверяет существует ли квадрат или нет.
 */
public class Square {

    //private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public double s(Point first, Point b) {
        return ((Math.pow(this.second.getX() - this.first.getX(), 2)) + (Math.pow(this.second.getY() - this.first.getY(), 2)));
    }

    public boolean exists() {
        double ab = s(first, second);
        double bc = s(second, third);
        double cd = s(third, fourth);
        double da = s(fourth, first);
        return (ab != bc && bc != cd && cd != da && da != ab);
    }


    public double area() {
        double ab = s(first, second);
        double bc = s(second, third);
        double cd = s(third, fourth);
        double da = s(fourth, first);
        double p = (ab + bc + cd + da) / 2;
        return Math.pow(p, 2);
    }
}
