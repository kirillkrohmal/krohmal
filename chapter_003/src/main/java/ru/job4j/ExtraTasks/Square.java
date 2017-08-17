package ru.job4j.ExtraTasks;

/**
 * Реализовать класс квадрат основанный на четырех точках Point(x, y). boolean exists() -
 * проверяет существует ли квадрат или нет.
 */
public class Square {
    Point a;

    public Square(Point a) {
        this.a = a;
    }

    boolean exists() {
       /* double AB = mathSqrt(a, b);
        double BC = mathSqrt(b, c);
        double CA = mathSqrt(c, a);
        if ((AB + BC) < CA || (BC + CA) < AB || (CA + AB) < BC) {
            throw new IllegalStateException("Введены некорректные координаты точек");
        } else {
            return true;
        }*/
        return false;
    }

    public double mathSqrt (Point a, Point b) {
        return (this.a.getX() + this.a.getY()) * Math.sqrt(2);
    }

    public double area() {

        return 0;
    }
}
