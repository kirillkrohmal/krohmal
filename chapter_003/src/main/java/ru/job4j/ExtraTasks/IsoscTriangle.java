package ru.job4j.ExtraTasks;

/**
 * Реализовать класс равнобедренный треугольник наследуя класс треугольник из задания 3.
 * Дополнить поведение метода boolean exists() - true, если треугольник равнобедренный.
 * Остальное поведение оставить прежним.
 */
public class IsoscTriangle extends Triangle{
    public IsoscTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    public boolean exists() {
        double AB = mathSqrt(a, b);
        double BC = mathSqrt(b, c);
        double CA = mathSqrt(c, a);
        if ((AB == BC) || (BC == CA) || (CA == AB)) {
            return true;
        } else {
            throw new IllegalStateException("Введены некорректные координаты точек");
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
