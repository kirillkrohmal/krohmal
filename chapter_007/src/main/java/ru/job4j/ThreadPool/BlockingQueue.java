package ru.job4j.ThreadPool;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Comp on 15.08.2018.
 */
public class BlockingQueue {
    private List queue = new LinkedList();
    private int limit = 10;

    BlockingQueue(int limit) {
        this.limit = limit;
    }


    synchronized void enqueue(Object item)
            throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }


    synchronized Object dequeue()
            throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }

        return this.queue.remove(0);
    }
}
