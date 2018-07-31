package ru.job4j.ThreadPoolTest;

import org.junit.Before;
import org.junit.Test;

import ru.job4j.ThreadPool.ThreadPool;
import java.util.concurrent.Executors;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 30.07.2018.
 */
public class ThreadPoolTest {
    private static final int MAX_T = 3;

    @Test
    public void iteratorTest() throws InterruptedException {
        Runnable r1 = new ThreadPool("tasks1");
        Runnable r2 = new ThreadPool("tasks2");
        Runnable r3 = new ThreadPool("tasks3");
        Runnable r4 = new ThreadPool("tasks1");
        Runnable r5 = new ThreadPool("tasks2");
        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ThreadPool pool = (ThreadPool) Executors.newFixedThreadPool(MAX_T);
        // passes the Task objects to the pool to execute (Step 3)
        pool.work(r1);
        pool.work(r2);
        pool.work(r3);
        pool.work(r4);
        pool.work(r5);
        // pool shutdown ( Step 4)
        pool.shutdown();

        assertThat(true, is("test name1"));

    }

    @Before
    public void iteratorTest2() {


        assertThat(true, is("test name2"));
    }

    @Test
    public void iteratorTest3() {

        assertThat(true, is("test name3"));
    }
}
