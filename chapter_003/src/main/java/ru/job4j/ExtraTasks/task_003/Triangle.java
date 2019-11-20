package ru.job4j.ExtraTasks.task_003;

import ru.job4j.ExtraTasks.task_002.Point;

/**
 * Реализовать класс треугольник. Треугольник должен описываться
 * через точки в системе координат. Объект треугольник должен иметь методы: boolean exists() -
 * проверяет существует ли треугольник или нет. double area() - вычисляет площадь треугольника.
 * Если треугольник не существует выбросить исключение java.lang.IllegalStateException
 */
public class Triangle {

    //private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double mathSqrt(Point a, Point b) {
        return Math.sqrt((Math.pow(this.second.getX() - this.first.getX(), 2)) + (Math.pow(this.second.getY() - this.first.getY(), 2)));
    }

    public boolean exists() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((ab + bc) < ca || (bc + ca) < ab || (ca + ab) < bc) {
            throw new IllegalStateException("Введены некорректные координаты точек");
        } else {
            return true;
        }
        //throw new UnsupportedOperationException();
    }

    public double area() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
        //throw new UnsupportedOperationException();
    }
}
