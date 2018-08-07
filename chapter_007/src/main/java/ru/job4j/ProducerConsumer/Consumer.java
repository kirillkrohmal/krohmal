package ru.job4j.ProducerConsumer;

/**
 * Created by Comp on 26.11.2017.
 */
public class Consumer implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;
    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>(10);
    private final Object lock = new Object();

    public Consumer(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                blockingQueue.offer(lock);
                transferObject.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}
/*

    private final Object lock = new Object();
    private boolean blockIt = true;

    SimpleBlockingQueue blockingQueue = new SimpleBlockingQueue<Integer>(10);

    @Override
    public void run() {
        synchronized (lock) {
            try {
                blockingQueue.offer(lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("unlock");
            if (this.blockIt) {
                lock.notify();
            }
        }
    }
*/
