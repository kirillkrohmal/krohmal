package ru.job4j.bomberman;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Comp on 11.08.2018.
 */
public class Monster extends Actor implements Runnable {
    private final Lock stepOperation = new ReentrantLock(true);

    /**
     * Time which wait monster for moving.
     */
    private static final int WAIT_TIME = 5000;


    /**
     * Create a new monster.
     *
     * @param board for moving.
     * @param x     position at the board.
     * @param y     position at the board.
     */
    public Monster(Board board, int x, int y) {
        super(board, x, y);
    }

    @Override
    void performMoving(Direction direction) {
        boolean makeStep = false;

        while (!makeStep) {
            if (stepOperation.tryLock()) {
                try {
                    if (isValidMoving(direction)) {
                        int prevX = getX();
                        int prevY = getY();
                        updateCoordinates(direction);
                        board.getBlock(getX(), getY()).attachActor(this);
                        board.getBlock(prevX, prevY).detachActor();
                        makeStep = true;
                    }
                } finally {
                    stepOperation.unlock();
                }
            }
            try {
                Thread.sleep(WAIT_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            performMoving(Direction.getRandomDirection());
        }
    }
}


