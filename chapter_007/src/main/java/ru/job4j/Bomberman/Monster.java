package ru.job4j.Bomberman;

/**
 * Created by Comp on 11.08.2018.
 */
public class Monster extends Figure implements Runnable {

    Direction direction = Direction.UP;

    public Monster(Cell[][] field, int x, int y) {
        super(field, x, y);
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if () {

            }
        }
    }
}
