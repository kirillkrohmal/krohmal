package ru.job4j.condition;

/**
 * Class Triangle.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 23.05.2017
 */
public class Triangle {
    /**
     * @param a первый экземпл¤р класса.
     * @since 23.05.2017
     */

    private Point a;
    /**
     * @param b второй экземпл¤р класса.
     * @since 23.05.2017
     */
    private Point b;
    /**
     * @param c третий экземпл¤р класса.
     * @since 23.05.2017
     */
    private Point c;

    /**
     * @param a первый аргумент.
     * @param b второй аргумент.
     * @param c третий аргумент.
     * @since 23.05.2017
     * Конструктор Triangle дл¤ класса Triangle инициализирует значения
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return mathSqrt расстояние между точками ab
     * @since 26.05.2017
     * Метод mathSqrt дл¤ класса Triangle вычисляет расстояние между точками
     */
    public double mathSqrt(Point a, Point b) {

        return Math.sqrt((Math.pow(this.b.getX() - this.a.getX(), 2)) + (Math.pow(this.b.getY() - this.a.getY(), 2)));
    }

    /**
     * @return area вычисляет площадь треугольника
     * @since 23.05.2017
     * Метод area дл¤ класса Triangle вычисляет площадь треугольника на графике и выявляет условие невозможности
     */
    public double area() {
        double ab = mathSqrt(a, b);
        double bc = mathSqrt(b, c);
        double ca = mathSqrt(c, a);

        if ((ab + bc) < ca || (ca + bc) < ab || (ca + ab) < bc) {
            return -1;
        } else {
            double p = (ab + bc + ca) / 2;
            return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
        }
    }
}
