package ru.job4j.ProducerConsumer;

/**
 * Created by Comp on 26.11.2017.
 */
public class Consumer implements Runnable {
    private volatile boolean isPresent = false;
    private final Object lock = new Object();
    private boolean blockIt = true;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("unlock");
            if (this.blockIt) {
                lock.notify();
            }
        }
    }
}
