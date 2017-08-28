package ru.job4j.ExtraTasks.task_003;

import ru.job4j.ExtraTasks.task_002.Point;

/**
 * Реализовать класс треугольник. Треугольник должен описываться
 * через точки в системе координат. Объект треугольник должен иметь методы: boolean exists() -
 * проверяет существует ли треугольник или нет. double area() - вычисляет площадь треугольника.
 * Если треугольник не существует выбросить исключение java.lang.IllegalStateException
 */
public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean exists() {
        double AB = mathSqrt(a, b);
        double BC = mathSqrt(b, c);
        double CA = mathSqrt(c, a);
        if ((AB + BC) < CA || (BC + CA) < AB || (CA + AB) < BC) {
            throw new IllegalStateException("Введены некорректные координаты точек");
        } else {
            return true;
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
