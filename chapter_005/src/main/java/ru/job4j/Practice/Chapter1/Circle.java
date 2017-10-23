package ru.job4j.Practice.Chapter1;

/**
 * Created by Comp on 20.10.2017.
 */
public class Circle extends Point {
    private int radius;
    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    int getRadius() {
        return radius;
    }
    @Override public String toString() {
        return "" + radius;
    }
    @Override void draw() {
        System.out.println("Circle drawn at " + super.toString() +
                " with radius " + toString());
    }
}
