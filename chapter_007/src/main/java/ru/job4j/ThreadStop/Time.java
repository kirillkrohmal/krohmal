package ru.job4j.ThreadStop;

import java.util.Timer;

/**
 * Created by Comp on 06.10.2017.
 */
public class Time implements Runnable {
    @Override
    public void run() {
        long time = System.currentTimeMillis();
        long programTime = System.currentTimeMillis() - time;

        while (Thread.interrupted()) {
            System.out.println("Время выполнения " + programTime);
            try {
                Thread.sleep(1999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
