package ru.job4j.ExecutorService;

import java.util.concurrent.Executors;


/**
 * Created by Comp on 27.07.2018.
 */
public class ExecutorService {
    void setPool() {
        java.util.concurrent.ExecutorService pool = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        pool.shutdown();
        while (!pool.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Execute " + Thread.currentThread().getName());
    }

}
