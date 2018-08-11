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
public class ThreadPool {
    private final Queue<Runnable> tasks = new LinkedBlockingQueue<>();

    private int size = Runtime.getRuntime().availableProcessors();
    private Thread[] threads = new Thread[size];


    /*Создать метод work(Runnable job) - этот метод должен добавлять задачи в блокирующую очередь tasks.*/
    public void work(Runnable job) throws InterruptedException {
        if (size == 0) {
            threads.wait();
        }

        Executors.newFixedThreadPool(3);
    }

    public ThreadPool() {
        for (int index = 0; index < size; index++) {
            threads[index] = new Worker();
            threads[index].start();
        }
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

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();
        Runnable timer = new Runnable() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };
    }
}
