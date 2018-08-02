package ru.job4j.home01;

import java.util.concurrent.atomic.AtomicInteger;

public class ProducerTask implements Runnable {
    private TransferObject transferObject;
    private volatile boolean stopped;
    static volatile AtomicInteger i = new AtomicInteger(0);

    ProducerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                transferObject.put(i.incrementAndGet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void stop() {
        stopped = true;
    }
}
