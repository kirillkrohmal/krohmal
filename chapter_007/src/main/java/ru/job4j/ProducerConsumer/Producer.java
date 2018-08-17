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
                blockingQueue.poll();
                transferObject.put(i.incrementAndGet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
    private final Object lock = new Object();
    private boolean blockIt = true;
    private int limit = 10;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>(10);
    private List<Object> queue = new LinkedList<>();

    @Override
    public void run() {
        synchronized (lock) {
            while (this.queue.size() == this.limit) {
                try {
                    transferObject.put(i.incrementAndGet());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("lock");
            if (this.blockIt) {
                try {
                    blockingQueue.poll();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("usefull work");
}*/


