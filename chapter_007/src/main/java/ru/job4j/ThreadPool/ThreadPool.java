package ru.job4j.ThreadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


/**
 * Created by Comp on 23.11.2017.
 */
public class ThreadPool implements Runnable {
    private final List<Thread> threads = new LinkedList<>();
    private final Queue<Runnable> tasks = new LinkedBlockingQueue<>();

    private int size = Runtime.getRuntime().availableProcessors();

    public ThreadPool(String tasks1) {
    }

    /*Создать метод work(Runnable job) - этот метод должен добавлять задачи в блокирующую очередь tasks.*/
    public void work(Runnable job) throws InterruptedException {
        if (size == 0) {
            threads.wait();
        }

        if (task1 != null) {
            tasks.add(job);
        }

        Executors.newFixedThreadPool(3);
    }

    public void shutdown() {

    }

    Runnable task1 = () -> {
        System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    };

    Runnable task2 = () -> {
        System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    };

    Runnable task3 = () -> {
        System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    };

    @Override
    public void run() {

    }
}
