package ru.job4j.ProducerConsumer;

/**
 * Created by Comp on 26.11.2017.
 */
public class TransferObject {
    private volatile boolean blockCustomer;
    private final Object lock = new Object();

    public int put() throws InterruptedException {
        synchronized (this.lock) {
            while (this.blockCustomer) {
                Thread.sleep(1000);
            }
        }

        return 0;
    }

    public int get() {
        while (this.blockCustomer) {
            lock.notify();
        }

        return 0;
    }
}
