package ru.job4j.ExtraTasks;

/**
 * Реализовать класс прямоугольный треугольник наследуя класс треугольник из задания 3.
 * Дополнить поведение метода boolean exists() - true, если треугольник равносторонний.
 * Остальное поведение оставить прежним.
 */
public class RectTriangle extends Triangle{
    public RectTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    public boolean exists() {
        double AB = mathSqrt(a, b);
        double BC = mathSqrt(b, c);
        double CA = mathSqrt(c, a);
        if ((AB + BC) == CA || (BC + CA) == AB || (CA + AB) == BC) {
            return true;
        } else {
            return false;
        }
    }

    public double mathSqrt (Point a, Point b) {
        return Math.sqrt((Math.pow(this.b.getX() - this.a.getX(), 2)) + (Math.pow(this.b.getY() - this.a.getY(), 2)));
    }

    public double area() {
        double AB = mathSqrt(a, b);
        double BC = mathSqrt(b, c);
        double CA = mathSqrt(c, a);
        double p = (AB + BC + CA) / 2;
        return Math.sqrt(p * ((p - AB) * (p - BC) * (p - CA)));
    }
}
