package ru.job4j.ThreadPool;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Comp on 23.11.2017.
 */
public class ThreadPool {
    ExecutorService poolExecutor = Executors.newFixedThreadPool(8);
    void add(FiberContextSwitchInterceptor.Work work) {

    }
}
