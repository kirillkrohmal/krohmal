package ru.job4j.ProducerConsumer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Comp on 23.11.2017.
 */
public class Producer implements Runnable {
    private final Object lock = new Object();
    private boolean blockIt = true;
    private int limit = 10;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>(10);
    private List<Object> queue = new LinkedList<>();

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        synchronized (lock) {
            while (this.queue.size() == this.limit) {
                try {
                    wait();
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
        }
    }
}
