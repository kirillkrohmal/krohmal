package ru.job4j.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


/**
 * Created by Comp on 27.07.2018.
 */

class ExecutorServiceCl {
    void setPool() {

        ExecutorService pool = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute " + Thread.currentThread().getName());
            }
        });
        pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute " + Thread.currentThread().getName());
            }
        });

        pool.shutdown();
        while (!pool.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void addWork(Runnable run) {

    }

}

        /*System.out.println("Execute "+Thread.currentThread().getName());
                }*/



