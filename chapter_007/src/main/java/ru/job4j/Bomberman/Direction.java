package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public class Direction {
    private int x;
    private int y;
    private Board board;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Direction(Board board) {
        this.board = board;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


