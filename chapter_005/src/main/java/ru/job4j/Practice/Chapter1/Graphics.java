package ru.job4j.Practice.Chapter1;

/**
 * Created by Comp on 20.10.2017.
 */
public class Graphics {
    public static void main(String[] args) {
        Point[] points = new Point[] {new Point(10, 0), new Circle(1,4, 5),
                new Circle(10,42, 5), new Rectangle(20, 30, 15, 25)};
        for (int i = 0; i < points.length; i++) {
            points[i].draw();
        }
    }
}
