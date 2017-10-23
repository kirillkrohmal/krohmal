package ru.job4j.Practice.Chapter1;

/**
 * Created by Comp on 20.10.2017.
 */
public class Point {
    private int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    @Override public String toString() {
        return "(" + x + ", " + y + ")";
    }
    void draw() {
        System.out.println("Point drawn at " + toString());
    }
}
