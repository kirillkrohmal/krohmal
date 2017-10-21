package ru.job4j.Practice;

/**
 * Created by Comp on 20.10.2017.
 */
public class Rectangle extends Point{
    private int w;
    private int r;

    Rectangle(int x, int y, int w, int r) {
        super(x, y);
        this.w = w;
        this.r = r;
    }

    public int getW() {
        return w;
    }

    public int getR() {
        return r;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", r=" + r +
                '}';
    }
}
