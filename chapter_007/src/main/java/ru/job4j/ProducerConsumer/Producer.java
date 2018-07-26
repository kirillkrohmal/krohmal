package ru.job4j.ProducerConsumer;

/**
 * Created by Comp on 23.11.2017.
 */
public class Producer implements Runnable {
    private volatile boolean isPresent = false;
    private boolean condition = true;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>();

    public static void main(String[] args) {

    }

    @Override
    public void run() {

    }
}
