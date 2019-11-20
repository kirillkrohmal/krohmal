package ru.job4j.home01;

public class ConsumerTask implements Runnable {
    private TransferObject transferObject;
    private volatile boolean stopped;

    ConsumerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                transferObject.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void stop() {
        stopped = true;
    }
}