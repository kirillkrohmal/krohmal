package ru.job4j.ExtraTasks.task_006;

import ru.job4j.ExtraTasks.task_002.Point;

/**
 * Реализовать класс квадрат основанный на четырех точках Point(x, y). boolean exists() -
 * проверяет существует ли квадрат или нет.
 */
public class Square {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean exists() {
        double AB = S(a, b);
        double BC = S(b, c);
        double CD = S(c, d);
        double DA = S(d, a);
        if ((AB == BC || BC == CD || CD == DA || DA == AB)) {
            return false;
        }  else{
            return true;
        }
    }

    public double S (Point a, Point b) {
        return ((Math.pow(this.b.getX() - this.a.getX(), 2)) + (Math.pow(this.b.getY() - this.a.getY(), 2)));
    }

    public double area() {
        double AB = S(a, b);
        double BC = S(b, c);
        double CD = S(c, d);
        double DA = S(d, a);
        double p = (AB + BC + CD + DA) / 2;
        return Math.pow(p, 2);
    }
}
