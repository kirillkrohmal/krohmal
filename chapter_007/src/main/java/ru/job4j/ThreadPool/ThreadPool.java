package ru.job4j.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by Comp on 23.11.2017.
 */
public class ThreadPool {
    private int size = Runtime.getRuntime().availableProcessors();
    private Thread[] threads = new Thread[size];
    private BlockingQueue taskQueue = null;
    private List<PoolThread> threads2 = new ArrayList<PoolThread>();
    private boolean isStopped = false;

    /*Создать метод work(Runnable job) - этот метод должен добавлять задачи в блокирующую очередь tasks.*/
    public void work(Runnable job) throws InterruptedException {
        if (size == 0) {
            threads.wait();
        }

        Executors.newFixedThreadPool(3);
    }

    public ThreadPool(int noOfThreads, int maxNoOfTasks) {
        taskQueue = new BlockingQueue(maxNoOfTasks);

        for (int i = 0; i < noOfThreads; i++) {
            threads2.add(new PoolThread(taskQueue));
        }
        for (PoolThread thread : threads2) {
            thread.start();
        }
    }

    public synchronized void execute(Runnable task) throws Exception {
        if (this.isStopped) throw
                new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.enqueue(task);
    }

    public synchronized void stop() {
        this.isStopped = true;
        for (PoolThread thread : threads2) {
            thread.doStop();
        }
    }
}


