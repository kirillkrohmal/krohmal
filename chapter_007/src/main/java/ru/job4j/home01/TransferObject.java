package ru.job4j.home01;

import java.util.concurrent.CountDownLatch;

public class TransferObject {
    private int value;
    private volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() throws InterruptedException {
        if (!isValuePresent) {
            this.wait();
        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        this.notify();
        return value;
    }

    synchronized void put(int value) throws InterruptedException {
        if (isValuePresent) {
            this.wait();
        }
        this.value = value;
        isValuePresent = true;
        System.out.println("Put: " + value);
        this.notify();
    }
}
