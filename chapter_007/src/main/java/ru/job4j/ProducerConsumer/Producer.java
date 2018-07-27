package ru.job4j.ProducerConsumer;

/**
 * Created by Comp on 23.11.2017.
 */
public class Producer implements Runnable {
    private boolean condition = true;
    private final Object lock = new Object();
    private boolean blockIt = true;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>();

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("lock");
            if (this.blockIt) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("usefull work");
        }
    }
}
