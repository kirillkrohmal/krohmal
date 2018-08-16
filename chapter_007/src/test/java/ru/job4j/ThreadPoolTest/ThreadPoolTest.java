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
