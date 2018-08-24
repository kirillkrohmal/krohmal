package ru.job4j.Bomberman;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Comp on 11.08.2018.
 */
public class Board {

    int width;
    int height;

    Board board;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    ReentrantLock[][] board() {

        return new ReentrantLock[0][];
    }



}
