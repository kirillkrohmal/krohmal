package ru.job4j.PingPong;


import javafx.scene.shape.Rectangle;

/**
 * Created by Comp on 04.05.2018.
 */

public class RectangleMove implements Runnable {
    private final Rectangle rect;

    public RectangleMove(Rectangle rect) {
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
        }
    }
}

