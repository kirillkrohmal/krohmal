package ru.job4j.producerconsumer;

/**
 * Created by Comp on 26.11.2017.
 */
public class Consumer implements Runnable {
    private TransferObject transferObject;
    private volatile boolean stopped;
    private SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>();
    private final Object lock = new Object();

    public Consumer(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                blockingQueue.enqueue(lock);
                transferObject.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}

