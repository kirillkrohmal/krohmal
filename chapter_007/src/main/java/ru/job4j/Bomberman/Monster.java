package ru.job4j.Bomberman;

import javafx.scene.control.Cell;

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
            if (!makeStep(direction)) {
                this.direction = direction.changeDir();
                System.out.println(String.format("Monster change direction: %s", direction));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
