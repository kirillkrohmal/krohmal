package ru.job4j.producerconsumer;

/**
 * Created by Comp on 26.11.2017.
 */
public class TransferObject {
    private volatile boolean blockCustomer = false;
    private int value;

    public synchronized void put(int value) throws InterruptedException {
        if (!blockCustomer) {
            wait();
        }
        this.value = value;
        blockCustomer = true;
        this.notify();
    }

    public synchronized int get() throws InterruptedException {
        if (!blockCustomer) {
            wait();
        }
        blockCustomer = true;
        this.notify();
        return value;
    }
}
