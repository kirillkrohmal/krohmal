package ru.job4j.ExtraTasks.task_006;

import ru.job4j.ExtraTasks.task_002.Point;

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

    public boolean exists() {
        throw new UnsupportedOperationException();
    }
   /* private Point a;
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
        double ab = S(a, b);
        double bc = S(b, c);
        double cd = S(c, d);
        double da = S(d, a);
        if ((ab == bc || bc == cd || cd == da || da == ab)) {
            return false;
        }  else{
            return true;
        }
    }

    public double S (Point a, Point b) {
        return ((Math.pow(this.b.getX() - this.a.getX(), 2)) + (Math.pow(this.b.getY() - this.a.getY(), 2)));
    }

    public double area() {
        double ab = S(a, b);
        double bc = S(b, c);
        double cd = S(c, d);
        double da = S(d, a);
        double p = (ab + bc + cd + da) / 2;
        return Math.pow(p, 2);
    }*/
}
