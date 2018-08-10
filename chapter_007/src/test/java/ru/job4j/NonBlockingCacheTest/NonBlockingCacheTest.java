package ru.job4j.NonBlockingCacheTest;

import org.junit.Test;
import ru.job4j.NonBlockingCache.Base;
import ru.job4j.NonBlockingCache.NonBlockingCache;

/**
 * Created by Comp on 09.08.2018.
 */
public class NonBlockingCacheTest {
    NonBlockingCache nonBlockingCache;
    Base base;

    @Test
    public void iteratorTest() {
        nonBlockingCache.add(base);
        //assertNull(nonBlockingCache.get(base));
    }

    @Test
    public void iteratorTest3() {
        nonBlockingCache.add(base);
        nonBlockingCache.delete(base);


        //assertThat(simpleBlockingQueue, is("test name3"));
    }
}


