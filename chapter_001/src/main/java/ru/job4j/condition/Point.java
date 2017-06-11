package ru.job4j.condition;

/**
 * Class Point.
 *
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 22.05.2017
 */
public class Point {
    /**
     * @param x.
     * @since 22.05.2017
     */
    private int x;
    /**
     * @param y.
     * @since 22.05.2017
     */
    private int y;

    /**
     * @param x аргумент.
     * @param y аргумент.
     * @since 22.05.2017
     * Конструктор Point для класса Point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return x.
     * @since 22.05.2017
     * Метод getX() для класса Point
     */
    public int getX() {
        return this.x;
    }

    /**
     * @return y.
     * @since 22.05.2017
     * Метод getY() для класса Point
     */
    public int getY() {
        return this.y;
    }

    /**
     * @param a аргумент.
     * @param b аргумент.
     * @return a и b.
     * @since 22.05.2017
     * Метод is для класса Point
     */
    public boolean is(int a, int b) {
        return this.x == a * x + b;
    }
}