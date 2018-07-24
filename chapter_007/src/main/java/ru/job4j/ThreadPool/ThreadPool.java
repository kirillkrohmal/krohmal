package ru.job4j.ThreadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Comp on 23.11.2017.
 */
public class ThreadPool {
    private final List<Thread> threads = new LinkedList<>();
    private final Queue<Runnable> tasks = new LinkedBlockingQueue<>();

    public void work(Runnable job) {

    }

    public void shutdown() {

    }
}
