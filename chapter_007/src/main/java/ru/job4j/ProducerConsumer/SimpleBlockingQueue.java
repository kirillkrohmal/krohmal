package ru.job4j.ProducerConsumer;

import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Comp on 26.05.2018.
 */

@ThreadSafe
public class SimpleBlockingQueue<T> {
    private List queue = new LinkedList();
    private int limit = 10;

    public SimpleBlockingQueue(int limit) {
        this.limit = limit;
    }

    public SimpleBlockingQueue() {

    }

    public synchronized void enqueue(Object item)
            throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized Object dequeue()
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



