package ru.job4j.ProducerConsumer;

/**
 * Created by Comp on 26.11.2017.
 */
public class Consumer implements Runnable {
    private volatile boolean isPresent = false;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>();

    @Override
    public void run() {

    }
}
