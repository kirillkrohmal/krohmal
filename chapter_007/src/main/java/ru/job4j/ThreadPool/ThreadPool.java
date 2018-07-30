package ru.job4j.ThreadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Comp on 23.11.2017.
 */
public class ThreadPool implements Runnable{
    private final List<Thread> threads = new LinkedList<>();
    private final Queue<Runnable> tasks = new LinkedBlockingQueue<>();

    int size = Runtime.getRuntime().availableProcessors();

    /*Создать метод work(Runnable job) - этот метод должен добавлять задачи в блокирующую очередь tasks.*/
    public void work(Runnable job) throws InterruptedException {
        if (size == 0) {
            threads.wait();
        }

        tasks.add(job);
    }

    public void shutdown() {

    }

    @Override
    public void run() {

    }
}
