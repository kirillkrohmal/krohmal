package ru.job4j.ThreadSafeTest;

import org.junit.Test;
import ru.job4j.DynamicListThread.DynamicListThread.DynamicListThread;
import ru.job4j.ThreadSafe.ThreadSafe;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 28.09.2018.
 */
public class ThreadSafeTest {
    @Test
    public void iteratorTest() throws InterruptedException {
        DynamicListThread thread = new DynamicListThread();

        ThreadSafe threadSafe = new ThreadSafe(thread);
        thread.add(threadSafe);
        assertThat(threadSafe, is(thread));

    }
}
