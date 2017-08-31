package ru.job4j.ExtraTasks.task_004;

import ru.job4j.ExtraTasks.task_002.Point;
import ru.job4j.ExtraTasks.task_003.Triangle;

/**
 * Реализовать класс равнобедренный треугольник наследуя класс треугольник из задания 3.
 * Дополнить поведение метода boolean exists() - true, если треугольник равнобедренный.
 * Остальное поведение оставить прежним.
 */
public class IsoscTriangle extends Triangle {
    public IsoscTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    public boolean exists() {
        double ab = mathSqrt(a, b);
        double bc = mathSqrt(b, c);
        double ca = mathSqrt(c, a);
        if ((ab == bc) || (bc == ca) || (ca == ab)) {
            return true;
        } else {
            throw new IllegalStateException("Введены некорректные координаты точек");
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
    }
}
