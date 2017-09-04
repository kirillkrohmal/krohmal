package ru.job4j.ExtraTasks.task_005;

import ru.job4j.ExtraTasks.task_002.Point;
import ru.job4j.ExtraTasks.task_003.Triangle;

/**
 * Реализовать класс прямоугольный треугольник наследуя класс треугольник из задания 3.
 * Дополнить поведение метода boolean exists() - true, если треугольник равносторонний.
 * Остальное поведение оставить прежним.
 */
public class RightTriangle extends Triangle {

    //private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        return super.exists();
    }
    /*public RightTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    public boolean exists() {
        double ab = mathSqrt(a, b);
        double bc = mathSqrt(b, c);
        double ca = mathSqrt(c, a);
        if ((ab + bc) == ca || (bc + ca) == ab || (ca + ab) == bc) {
            return true;
        } else {
            return false;
        }
    }

    public double mathSqrt (Point a, Point b) {
        return Math.sqrt((Math.pow(this.b.getX() - this.a.getX(), 2)) + (Math.pow(this.b.getY() - this.a.getY(), 2)));
    }

    public double area() {
        double ab = mathSqrt(a, b);
        double bc = mathSqrt(b, c);
        double ca = mathSqrt(c, a);
        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
    }*/
}
