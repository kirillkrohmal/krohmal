package ru.job4j.ThreadPool;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Comp on 13.08.2018.
 */
public class PoolThread extends Thread {
    private BlockingQueue taskQueue = null;
    private boolean isStopped = false;

    public PoolThread(BlockingQueue queue) {
        taskQueue = queue;
    }

    public void run() {
        while (!isStopped()) {
            try {
                //Runnable runnable = (Runnable) taskQueue.dequeue();
                //runnable.run();
            } catch (Exception e) {
                //log or otherwise report exception,
                //but keep pool thread alive.
            }
        }
    }

    public synchronized void doStop() {
        isStopped = true;
        this.interrupt(); //break pool thread out of dequeue() call.
    }

    public synchronized boolean isStopped() {
        return isStopped;
    }
}