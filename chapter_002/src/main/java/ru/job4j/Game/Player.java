package ru.job4j.Game;

import ru.job4j.TestTask.ChessFigure;

import java.util.Random;

/**
 * Created by Comp on 07.07.2017.
 */
public class Player {
    int x;
    int y;
    public Board game;
    Player player;

    int getRandomCell() {
        return Integer.valueOf((char)(System.currentTimeMillis() + getRandomCell()));
    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ChessFigure{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (x != player.x) return false;
        return y == player.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public void left() {
        player.y--;
        player.x++;
    }

    public void right() {
        player.x--;
        player.y++;
    }

    public void up() {
        player.x--;
        player.y--;
    }

    public void down() {
        player.x++;
        player.y++;
    }
}
