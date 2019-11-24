package ru.job4j.pingpong;

import javafx.scene.shape.Rectangle;

/**
 * Created by Comp on 04.05.2018.
 */
public class RectangleMove implements Runnable {
    private final Rectangle rect;

    RectangleMove(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public void run() {
        while (true) {
            this.rect.setX(this.rect.getX() + 1);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.rect.intersects(350, 100, 10, 10)) {
                if (this.rect.getX() < 300) {
                    this.rect.setX(this.rect.getX() - 1);
                }
            }
        }
    }
};


