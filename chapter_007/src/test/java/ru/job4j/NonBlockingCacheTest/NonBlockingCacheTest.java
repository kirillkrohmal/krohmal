package ru.job4j.NonBlockingCacheTest;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.NonBlockingCache.Base;
import ru.job4j.NonBlockingCache.NonBlockingCache;

import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.core.Is.is;

/**
 * Created by Comp on 09.08.2018.
 */
public class NonBlockingCacheTest {
    NonBlockingCache nonBlockingCache;
    Base base;

    @Test
    public void iteratorTest() throws InterruptedException {
        AtomicReference<Exception> ex = new AtomicReference<>();
        Thread thread = new Thread(
                () -> {
                    try {
                        throw new RuntimeException("Throw Exception in Thread");
                    } catch (Exception e) {
                        ex.set(e);
                    }
                }
        );
        thread.start();
        thread.join();
        Assert.assertThat(ex.get().getMessage(), is("Throw Exception in Thread"));
    }


    @Test
    public void iteratorTest3() {
        nonBlockingCache.add(base);
        nonBlockingCache.delete(base);


        //assertThat(simpleBlockingQueue, is("test name3"));
    }
}


