package ru.job4j.Bomberman;

import javafx.scene.control.Cell;

/**
 * Created by Comp on 01.11.2018.
 */
public class Player extends Actor implements Runnable {
    public Player(Board board, int x, int y) {
        super(board, x, y);
    }

    void performMoving(Direction direction) {
        if (isValidMoving(direction)) {
            int currentX = getX();
            int currentY = getY();
            synchronized (board.getBlock(currentX, currentY)) {
                updateCoordinates(direction);
                synchronized (board.getBlock(getX(), getY())) {
                    board.getBlock(currentX, currentY).detachActor();
                    board.getBlock(getX(), getY()).attachActor(this);
                }
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void run() {

    }
}
