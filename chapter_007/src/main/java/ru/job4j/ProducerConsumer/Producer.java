package ru.job4j.ProducerConsumer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Comp on 23.11.2017.
 */
public class Producer implements Runnable {
    private TransferObject transferObject;
    private volatile boolean stopped;
    static volatile AtomicInteger i = new AtomicInteger(0);
    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>();

    public Producer(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                blockingQueue.dequeue();
                transferObject.put(i.incrementAndGet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


